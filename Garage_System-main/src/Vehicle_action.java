import java.util.Scanner;

public class Vehicle_action {
    public Vehicle_operations vehicle_operations;

    public Vehicle_action()
    {
        vehicle_operations= new Vehicle_operations();
    }

    public void park_in()
    {
        vehicle_operations.get_vehicle_information();
        vehicle_operations.reserve_slot();
    }

    public void park_out()
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the wanted car id to park out: ");
        int id=obj.nextInt();
        vehicle_operations.unresrve_slot(id);
    }
}
