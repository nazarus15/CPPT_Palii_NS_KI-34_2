package KI_34.Palii.lab4;

public class Stop_Play {
    public boolean status;

    public Stop_Play(){
        status = false;
    }

    void Play(){
        if(Battery.percentage>6){
            status = true;
            Battery.DecreasePercentage(5);
            System.out.print("...playing\n");
        }else {
            System.out.print("\nCharge your battery");
        }
    }

    void Stop(){

        status = false;
    }

}
