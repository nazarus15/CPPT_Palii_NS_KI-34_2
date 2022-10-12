/**
 * lab 4 package
 */
package KI_34.Palii.lab4;
import java.io.*;
/**
 * Computer Mouse Application class implements main method for ComputerMouse
 class possibilities demonstration
 * @author EOM Stuff
 * @version 1.0
 */
public class DictaphoneApp {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        Dictaphone micro = new Dictaphone();


        micro.Discharge_player(15);
        micro.ShowAllINFO();
        System.out.println("\n\n");

        micro.Charge(10);
        micro.ShowAllINFO();

        micro.show_memory();

        //interface realisation
        System.out.println("Power of dictophone: " + micro.power());
        System.out.println("Color of dictophone: " + micro.color );

    }
}