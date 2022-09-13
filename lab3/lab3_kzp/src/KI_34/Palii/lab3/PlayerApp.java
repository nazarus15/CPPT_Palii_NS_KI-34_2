/**
 * lab 3 package
 */
package KI_34.Palii.lab3;
        import java.io.*;
/**
 * Computer Mouse Application class implements main method for ComputerMouse
 class possibilities demonstration
 * @author EOM Stuff
 * @version 1.0
 */
public class PlayerApp
{
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        Player palii = new Player(25,100,3,33);

        palii.ShowAllINFO();
        palii.Charge_player(12);
        System.out.print("\n\n");
        palii.ShowAllINFO();
        System.out.print("\n\n");


        palii.PlayMusic();
        palii.Status_of_play();
        System.out.print("\n\n");


        palii.Discharge_player(20);
        palii.Energy_save_mode();
        palii.Charge_player(40);
        palii.Energy_save_mode();
        System.out.print("\n\n");

        palii.CloseFile();

    }
}