/**
 * lab 3 package
 */

package KI_34.Palii.lab3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


/**
 * Class <code>Player</code> implements audio player
 * @author Nazarii Palii
 * @version 1.0
 */

public class Player {

    private Battery battery;
    private Memory memory ;
    private Stop_Play stopPlay;
    private Volume volume;
    private final PrintWriter fout;


    /**
     * Constructor
     * @throws FileNotFoundException
     */

    public  Player()throws FileNotFoundException {
        battery = new Battery();
        memory = new Memory();
        stopPlay = new Stop_Play();
        volume = new Volume();

        fout = new PrintWriter(new File("Log.txt"));
    }



    /**
     * Constructor
     * @throws FileNotFoundException
     */
    public  Player(int percentage,int memory_has, int songs_dwnl, int vol)throws FileNotFoundException {
        battery = new Battery(percentage);
        memory = new Memory(memory_has,songs_dwnl);
        stopPlay = new Stop_Play();
        volume = new Volume(vol);

        fout = new PrintWriter(new File("Log.txt"));
    }



    /**
     * Method show info about player
     */

    void ShowAllINFO(){
        battery.Show_percentage();
        memory.ShowMemory();
        System.out.print("Status of playing: " + stopPlay.status + "\n");
        System.out.print("Volume level: " + volume.volume + "\n");

        fout.println("info showed\n");
    }


    /**
     * Method simulates battery save mode
     */
    void Energy_save_mode(){
        if(battery.percentage<25)
        {
            battery.save_mode = true;
            System.out.print("Battery in save mode\n");
            volume.SetVolume(20);
        }else{
            battery.save_mode = false;
            System.out.print("Battery is well charged\n");
        }
        fout.println("battery save mode is called\n");
    }


    /**
     * Method simulates playing music
     */
    void PlayMusic(){
        stopPlay.Play();
        fout.println("music playing\n");
    }


    /**
     * Method show status of playing
     */
    void Status_of_play(){
        if(stopPlay.status){
            System.out.print("Playing\n");
        }else{
            System.out.print("Stopped\n");
        }
        fout.println("status of music showed\n");
    }


    /**
     * Method simulates charging player
     */
    void Charge_player(int perc){
        battery.Charge(perc);
        fout.println("battery was charged\n");
    }

    /**
     * Method simulates discharging player
     */
    void Discharge_player(int perc){
        Battery.DecreasePercentage(perc);
        fout.println("battery was discharged\n");
    }

    /**
     * Method releases used recourses
     */
    public void CloseFile (){
        fout.close();
    }












}
