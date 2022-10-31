package KI34.Palii.lab7;


public class LandPlotDriver{
    public static void main(String[] args)
    {


        LandPlot <? super Area> hdd = new LandPlot <>();
        hdd.AddData(new House("Palii's", "Blue", 200));
        hdd.AddData(new House("Trahc's", "Purple", 500));
        hdd.AddData(new Car("Lambogini", "Brown", 10));


        System.out.println("Number of cars: " + Car.car);


        Area res = hdd.findMax();
        System.out.print("The biggest area on LandPlot is: \n");
        res.print();
    }
}
