//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package KI_34.Palii.lab3;

public class Stop_Play {
    public boolean status = false;

    public Stop_Play() {
    }

    void Play() {
        if (Battery.percentage > 6) {
            this.status = true;
            Battery.DecreasePercentage(5);
            System.out.print("...playing\n");
        } else {
            System.out.print("\nCharge your battery");
        }

    }

    void Stop() {
        this.status = false;
    }
}
