package KI_34.Palii.lab4;

public class Battery {
    public static int percentage;
    public int left_to_play;
    public boolean save_mode;

    public Battery(){
        percentage = 100;
        left_to_play = 15*percentage;
        save_mode = false;
    }

    public Battery (int percentage_of_battery){
        percentage = percentage_of_battery;
        left_to_play = 15*percentage;
        save_mode = false;
    }

    float ret_battery(){
        return (percentage);
    }

    void Show_percentage (){
        System.out.print("Battery level: " + percentage);
    }

    void Charge(int perc){
        percentage = percentage + perc;
        if(percentage>100){
            percentage = 100;
        }
    }

    static void DecreasePercentage(int decrease_perc)
    {
        percentage = percentage - decrease_perc;
    }
}
