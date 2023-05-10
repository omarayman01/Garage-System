/* Members:-
 * Name:                    id:
 * Ahmed Waleed Shawky      20200060
 * Omar ayman saied         20200343
 * Hadeer Ahmed Hamada      20210616
 * Huda Muhammad Rashed     20200620
 */

import java.util.Scanner;
public class Vehicle
{
    //Attributes
    private String model_name;
    private int model_year,vehicle_id;
    private double width,depth;


    //Methods
    public Vehicle(String model_name,int model_year,int vehicle_id,double width,double depth)   //Vehicle constructor
    {
        this.model_name=model_name;
        this.model_year=model_year;
        this.vehicle_id=vehicle_id;
        this.width=width;
        this.depth=depth;
    }

    /*******************
     *Setter and getters*
     ********************/

    public void set_id(int id)
    {
        this.vehicle_id=id;
    }

    public int get_id()
    {
        return vehicle_id;
    }

    public double get_width()
    {
        return width;
    }

    public double get_depth()
    {
        return depth;
    }

    public String get_model_name() {return model_name;}

}