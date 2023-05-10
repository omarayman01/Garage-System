import java.util.Scanner;

 public class Garage {
    public  Slots[] slots;
    private int vehicle_counter,slots_no;
    private double total_income;
    private int parking_method;

    public Garage() //creates Garage object that takes number of slots
                    //then creates that number of slots with each depth and width.
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number of slots in the garage:");
        slots_no=obj.nextInt();
        total_income=0;
        vehicle_counter=0;
        slots = new Slots[slots_no];

        for (int i = 0; i < slots_no; i++) {
            slots[i]= new Slots();
        }
    }

    public Garage(int slots_no)
    {
        this.slots_no=slots_no;
        total_income=0;
        vehicle_counter=0;
        slots = new Slots[slots_no];
    }

    public void increment_total_income (double income)
    {
        total_income+=income;
    }

    public void increment_vehicle_counter ()
    {
        vehicle_counter++;
    }

    public void set_parking_methode()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Choose preferred parking method to implement in the garage:");
        System.out.println("1- First fit method.");
        System.out.println("2- Best fit method.");
        System.out.print("Choice: ");
        parking_method=obj.nextInt();

    }

     public int get_slots_no()
     {return slots_no;}
     public int get_vehicle_counter()
     {return vehicle_counter;}
     public double get_total_income()
     {return total_income;}

     public int get_parking_method()
     {return parking_method;}

}
