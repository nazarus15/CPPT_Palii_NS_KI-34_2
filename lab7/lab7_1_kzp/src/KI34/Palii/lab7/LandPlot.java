package KI34.Palii.lab7;

import java.util.ArrayList;

public class LandPlot <T extends Area>
{
    private ArrayList<T> arr;

    public LandPlot()
    {
        arr = new ArrayList<T>();
    }

    public T findMax()
    {
        if (!arr.isEmpty())
        {
            T min = arr.get(0);
            for (int i=1; i< arr.size(); i++)
            {
                if ( arr.get(i).compareTo(min) > 0 )
                    min = arr.get(i);
            }
            return min;
        }
        return null;
    }

   /* public T findQuantity()
    {

    }*/


    public void AddData(T data)
    {
        arr.add(data);
        System.out.print("Element added: ");
        data.print();
    }

    public void DeleteData(int i)
    {
        arr.remove(i);
    }



}
