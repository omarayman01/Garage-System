public class Garage_operations implements Total_income_vehicle_num {

    public static Garage garage;

    @Override
    public void calculate_total_income_and_vehicle_no() {
        System.out.println("Number of Vehicles:"+garage.get_vehicle_counter());
        System.out.println("Total Income:"+String.format("%.2f",garage.get_total_income()));
        System.out.println();
    }

    public void show_available_slots()
    {
        int flag=-1;
        System.out.println("Available slots are: ");
        for (int i = 0; i < garage.get_slots_no(); i++) {
            if (garage.slots[i].is_empty())
            {
                System.out.println("Slot number"+ (i+1) +":\twidth:"+ garage.slots[i].get_width()+"\tDepth:"+garage.slots[i].get_depth());
                flag=1;
            }
        }
        if (flag==-1)
        {
            System.out.println("No slots are free or available at this moment.");
        }
        System.out.println();
    }

    public void add_slots_with_dimensions()
    {
        garage=new Garage();
    }

    public void choose_default_parking_methode()
    {
        garage.set_parking_methode();
    }

}
