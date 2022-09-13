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
            int first_size = (SizeOfArr.nextInt());
            int size = first_size - 2;


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


            /*char symbol3 = 'y';
            for (int i = 0; i < size; i++) {        //запис зубчастої матриці (для перевірки чи вивід йде кожного елемента окремо)
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == (size - 1)) {
                        arr2[i][j] = symbol2;
                    } else if (j < 2) {
                        arr2[i][j] = symbol3;
                    }
                }
            }*/



            for (char[] row : arr2) {                             // вивід зубчастої матриці без форматування
                System.out.println(Arrays.toString(row));
            }


            int n;
            int m;
            for (int i = 0; i < first_size; i++) {        //вивід зубчастої матриці з форматуванням
                n = i - 1;
                m = 0;
                for (int j = 0; j < first_size; j++) {
                    if ((i == 1 && j!= 0 && j!= (first_size -1)) || (i == (first_size - 2) && j != 0 && j != (first_size -1))) {
                        System.out.print(arr2[n][m] + "\t");
                        pw.print(arr2[n][m] + "\t");
                        m++;
                    } else if (i > 1 && i < (first_size-2) && (j == 1 ||  j == (first_size-1))) {
                        System.out.print(arr2[n][m]);
                        pw.print(arr2[n][m]);
                        m++;
                    } else {
                        System.out.print("\t");
                        pw.print("\t");
                    }
                }
                System.out.print("\n");
                pw.print("\n");
            }


            pw.close();
        }
    }
}