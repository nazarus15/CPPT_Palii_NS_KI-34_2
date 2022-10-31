package KI34.Palii.lab7;

public class House implements Area {

    public static int house = 0;
    private String houseName;
    private String color;
    private int area;

    public House(String hName, String hColor, int hArea)
    {
        houseName = hName;
        color = hColor;
        area = hArea;
        house += 1;
    }

    public String getHouseName()
    {
        return houseName;
    }

    public void setHouseName(String name)
    {
        houseName = name;
    }

    public String getHouseColor()
    {
        return color;
    }

    public void setHouseColor(String color)
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
        System.out.print("House Name: " + houseName + ", Color:" + color + ", Area: " + area + ";\n");
    }
}
