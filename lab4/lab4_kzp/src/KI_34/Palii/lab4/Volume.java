package KI_34.Palii.lab4;

public class Volume {
    public int volume;

    public Volume(){
        volume = 0;
    }

    public Volume(int vol){
        volume = vol;
    }

    void SetVolume(int volumeRate){
        volume = volumeRate;
        if(volumeRate>100)
        {
            volume = 100;
        }

        if(volume < 20){
            Battery.DecreasePercentage(1);
        } else if (volume>20 && volume<50) {
            Battery.DecreasePercentage(3);
        } else if (volume>50 && volume<80) {
            Battery.DecreasePercentage(4);
        } else if (volume>80) {
            Battery.DecreasePercentage(5);
        }
    }
}
