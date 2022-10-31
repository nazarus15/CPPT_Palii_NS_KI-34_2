package KI34.Palii.lab7;

public class Car implements Area{

    public static int car = 0;
    private String carName;
    private String color;
    private int area;

    public Car(String cName, String cColor, int cArea)
    {
        carName = cName;
        color = cColor;
        area = cArea;
        car += 1;
    }

    public String getCarName()
    {
        return carName;
    }

    public void setCarName(String name)
    {
      carName = name;
    }

    public String getCarColor()
    {
        return color;
    }

    public void setCarColor(String color)
    {
        this.color = color;
    }




    public int getSize()
    {
        return area;
    }
    public int compareTo(Area p)
    {
        Integer s = area;
        return s.compareTo(p.getSize());
    }
    public void print()
    {
        System.out.print("Car Name: " + carName + ", Color:" + color + ", Area: " + area + ";\n");
    }

}
