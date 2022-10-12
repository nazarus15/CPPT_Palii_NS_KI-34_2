package KI34.Palii.lab5;
import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * Class <code>Equations</code> implements method for ((2 / tg(x)) / x) expression
 * calculation
 * @author EOM Stuff
 * @version 1.0
 */
class Equations
{
    /**
     * Method calculates the (7x/tg(2x-4)) expression
     * @param <code>x</code> Angle in degrees
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException
    {
        double y, rad;
        rad = (((x) * Math.PI )/ 180.0);
        try
        {
            y = ((7.0*x) / Math.tan(rad*2-4));

            // Якщо результат не є числом, то генеруємо виключення
            if (y==Double.NaN || y==Double.NEGATIVE_INFINITY ||
                    y==Double.POSITIVE_INFINITY || x==90 || x== -90)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex)
        {
// створимо виключення вищого рівня з поясненням причини
// виникнення помилки
            if (rad==Math.PI/2.0 || rad==-Math.PI/2.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else if (x==0){
            throw new CalcException("Exception reason: X = 0");}
            else{
            throw new CalcException("Unknown reason of the exception during exception calculation");
            }
        }

        return y;
    }
}