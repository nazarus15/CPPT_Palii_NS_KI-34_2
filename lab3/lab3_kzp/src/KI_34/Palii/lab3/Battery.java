//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package KI_34.Palii.lab3;

public class Battery {
    public static int percentage;
    public int left_to_play;
    public boolean save_mode;

    public Battery() {
        percentage = 100;
        this.left_to_play = 15 * percentage;
        this.save_mode = false;
    }

    public Battery(int percentage_of_battery) {
        percentage = percentage_of_battery;
        this.left_to_play = 15 * percentage;
        this.save_mode = false;
    }

    void Show_percentage() {
        System.out.print("Battery level: " + percentage);
    }

    void Charge(int perc) {
        percentage += perc;
        if (percentage > 100) {
            percentage = 100;
        }

    }

    static void DecreasePercentage(int decrease_perc) {
        percentage -= decrease_perc;
    }
}
