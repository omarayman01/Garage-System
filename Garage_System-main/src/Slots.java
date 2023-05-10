import java.util.Scanner;
public class Slots {
    private double width,depth;
    private boolean available;
    private int parked_vehicle_id;

    public static Time time;


    public Slots ()
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter slot width and depth: ");
        width=obj.nextDouble();
        depth=obj.nextDouble();
        available=true;
        time=new Time();
    }

    public Slots (double width,double depth)
    {
        this.width=width;
        this.depth=depth;
        available=true;
    }

    public double get_width() {return width;}
    public double get_depth() {return depth;}

    public void set_vehicle_id(int id)
    {
        parked_vehicle_id=id;
    }
    public int get_parked_vehicle_id ()
    {
        return parked_vehicle_id;
    }

    public boolean is_empty(){
        if (available)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void set_availability (boolean val)
    {
        available=val;
    }
}
