package KI34.Palii.lab6;
import java.io.*;
import java.util.*;
class CalcWFio
{

    public void writeResTxt(String fName) throws FileNotFoundException
    {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ",result);
        f.close();
    }
    public void readResTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }
    public void writeResBin(String fName) throws FileNotFoundException, IOException
    {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }
    public void readResBin(String fName) throws FileNotFoundException, IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }
    public void calculate(double x) throws CalcException
    {
        double y, deg, rad;
        deg = (2*x - 4);
        rad = Math.toRadians(deg);
        try
        {
            y = ((7.0*x) / Math.abs(Math.tan(rad)));
            // Якщо результат не є числом, то генеруємо виключення
            if (y==Double.NaN || y==Double.NEGATIVE_INFINITY ||
                    y==Double.POSITIVE_INFINITY || (2*x - 4)==90 || (2*x - 4)== -90)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex)
        {
            // створимо виключення вищого рівня з поясненням причини
            // виникнення помилки
            if (rad==Math.PI/2.0 || rad==-Math.PI/2.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else if (Math.tan(rad)==0)
                throw new CalcException("Exception reason: tg(x) = 0");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        result = y;
    }
    public double getResult()
    {
        return result;
    }
    private double result;
}
