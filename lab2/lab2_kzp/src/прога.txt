import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintWriter;



/**
 * Клас Lab2PaliiKI34 релізує лабораторну роботу №2
 *
 * @author chemp
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab2PaliiKI34
{
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     *
     */

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File ("FileOut.txt");
        try (PrintWriter pw = new PrintWriter(file)) {

            System.out.println("Введіть розмір мтариці");
            Scanner SizeOfArr = new Scanner(System.in);
            int size = (SizeOfArr.nextInt()) - 2;


            String symbol;
            System.out.println("Введіть елемент заповнення масиву");
            Scanner scanSymbol = new Scanner(System.in);
            symbol = scanSymbol.nextLine();
            char symbol2 = symbol.charAt(0);


            if (symbol.length() != 1) {                   // шлях при некоректному вводі
                System.out.println("Некоректний ввід");
                System.exit(0);
            }


            char arr2[][] = new char[size][];           // створення зубчастої матриці
            for (int i = 0; i < size; i++) {
                if (i == 0 || i == (size - 1)) {
                    arr2[i] = new char[size];
                } else {
                    arr2[i] = new char[2];
                }
            }


            for (int i = 0; i < size; i++) {        //запис зубчастої матриці
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == (size - 1)) {
                        arr2[i][j] = symbol2;
                    } else if (j < 2) {
                        arr2[i][j] = symbol2;
                    }
                }
            }

            for (char[] row : arr2) {                             // вивід в консоль
                System.out.println(Arrays.toString(row));
            }


            for (char[] row : arr2) {                             // вивід в файл
                pw.println(Arrays.toString(row));
            }
            pw.close();
        }
    }
}