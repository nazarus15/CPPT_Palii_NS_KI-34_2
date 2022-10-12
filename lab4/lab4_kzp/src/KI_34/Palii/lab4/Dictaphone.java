package KI_34.Palii.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Dictaphone extends Player implements Interface{

    /**
     * Constructor
     * @throws FileNotFoundException
     */
    public Dictaphone() throws FileNotFoundException {
        Battery battery;
        Memory memory ;
        Stop_Play stopPlay;
        Volume volume;
    }
    /**
     * Method show memory
     */
    public void show_memory(){
        System.out.println("Hours left to record: " + (memory.ret_memory()/60));
        }

    /**
     * Interface method
     */
    @Override
    public float power() {
        return (memory.ret_memory()* battery.ret_battery());
    }
}
