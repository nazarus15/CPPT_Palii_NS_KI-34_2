//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package KI_34.Palii.lab3;

public class Volume {
    public int volume;

    public Volume() {
        this.volume = 0;
    }

    public Volume(int vol) {
        this.volume = vol;
    }

    void SetVolume(int volumeRate) {
        this.volume = volumeRate;
        if (volumeRate > 100) {
            this.volume = 100;
        }

        if (this.volume < 20) {
            Battery.DecreasePercentage(1);
        } else if (this.volume > 20 && this.volume < 50) {
            Battery.DecreasePercentage(3);
        } else if (this.volume > 50 && this.volume < 80) {
            Battery.DecreasePercentage(4);
        } else if (this.volume > 80) {
            Battery.DecreasePercentage(5);
        }

    }
}
