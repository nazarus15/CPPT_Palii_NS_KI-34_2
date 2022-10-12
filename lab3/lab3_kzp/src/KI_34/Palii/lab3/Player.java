//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package KI_34.Palii.lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Player {
    private final Battery battery;
    private final Memory memory;
    private final Stop_Play stopPlay;
    private final Volume volume;
    private final PrintWriter fout;

    public Player() throws FileNotFoundException {
        this.battery = new Battery();
        this.memory = new Memory();
        this.stopPlay = new Stop_Play();
        this.volume = new Volume();
        this.fout = new PrintWriter(new File("Log.txt"));
    }

    public Player(int percentage, int memory_has, int songs_dwnl, int vol) throws FileNotFoundException {
        this.battery = new Battery(percentage);
        this.memory = new Memory(memory_has, songs_dwnl);
        this.stopPlay = new Stop_Play();
        this.volume = new Volume(vol);
        this.fout = new PrintWriter(new File("Log.txt"));
    }

    void ShowAllINFO() {
        this.battery.Show_percentage();
        this.memory.ShowMemory();
        System.out.print("Status of playing: " + this.stopPlay.status + "\n");
        System.out.print("Volume level: " + this.volume.volume + "\n");
        this.fout.println("info showed\n");
    }

    void Energy_save_mode() {
        Battery var10000 = this.battery;
        if (Battery.percentage < 25) {
            this.battery.save_mode = true;
            System.out.print("Battery in save mode\n");
            this.volume.SetVolume(20);
        } else {
            this.battery.save_mode = false;
            System.out.print("Battery is well charged\n");
        }

        this.fout.println("battery save mode is called\n");
    }

    void PlayMusic() {
        this.stopPlay.Play();
        this.fout.println("music playing\n");
    }

    void Status_of_play() {
        if (this.stopPlay.status) {
            System.out.print("Playing\n");
        } else {
            System.out.print("Stopped\n");
        }

        this.fout.println("status of music showed\n");
    }

    void Charge_player(int perc) {
        this.battery.Charge(perc);
        this.fout.println("battery was charged\n");
    }

    void Discharge_player(int perc) {
        Battery.DecreasePercentage(perc);
        this.fout.println("battery was discharged\n");
    }

    void load_song(int amout) {
        this.memory.DownloadSongs(amout);
    }

    public void CloseFile() {
        this.fout.close();
    }
}
