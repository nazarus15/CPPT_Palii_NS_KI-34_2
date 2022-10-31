package KI34.Palii.lab6;
import java.io.*;
import java.util.*;
import java.io.RandomAccessFile;

import static java.lang.System.out;

public class FioApp {
    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {

        try
        {
            CalcWFio obj = new CalcWFio();
            Scanner s = new Scanner(System.in);
            System.out.print("Enter data: ");
            double data = s.nextDouble();

            obj.calculate(data);
            System.out.println("Result is: " + obj.getResult());
            obj.writeResTxt("textRes.txt");
            obj.writeResBin("BinRes.bin");


            obj.readResBin("BinRes.bin");
            System.out.println("Result is: " + obj.getResult());
            obj.readResTxt("textRes.txt");
            System.out.println("Result is: " + obj.getResult());


        }
        catch (CalcException ex)
        {
            // Блок перехоплює помилки обчислень виразу
            out.print(ex.getMessage());
        }


        String word = "adfsa";
        RandomAccessFile file = new RandomAccessFile("sample.store", "rw");
        file.seek(1);
        file.writeUTF(word);
    }
}
