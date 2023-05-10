import java.util.Scanner;

public class Garage_owner_actions {

    public Garage_operations garage_operations;

    public Garage_owner_actions()
    {
        garage_operations=new Garage_operations();
    }

    public void set_up_garage()
    {
        garage_operations.add_slots_with_dimensions();
        garage_operations.choose_default_parking_methode();
    }

    public void display_available_slots()
    {
        garage_operations.show_available_slots();
    }

    public void display_total_income_and_vehicle_no()
    {
        garage_operations.calculate_total_income_and_vehicle_no();
    }
}
