import java.util.Scanner;

public class Vehicle_operations implements Calculate_fees {
    public Vehicle vehicle;
    private Garage garage;
    private Parking_method parking_method;

    public Vehicle_operations()
    {
        this.garage=Garage_operations.garage;
        if (garage.get_parking_method()==1)
        {
            parking_method= new First_fit_method();
        }
        else
        {
            parking_method= new Best_fit_method();
        }
    }


    @Override
    public void calculate_parking_fees(Slots slot) {
        double fees;
        fees=(slot.time.get_time_spent_in_hours()*5.0);
        garage.increment_total_income(fees);
        System.out.println("you stayed for: "+String.format("%.2f",slot.time.get_time_spent_in_hours())+" hours which is equal to: "+String.format("%.1f",(slot.time.get_time_spent_in_hours()*60))+" minutes");
        System.out.println("your parking fees are: "+String.format("%.2f",fees));
        System.out.println();
    }

    public void get_vehicle_information()
    {
        //asking for vehicle information
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Vehicle infromation :-");
        System.out.print("Model name: ");
        String model_name= obj.nextLine();
        System.out.print("Model year: ");
        int model_year= obj.nextInt();
        System.out.print("Vehicle ID: ");
        int id= obj.nextInt();
        System.out.print("Vehicle width: ");
        double width= obj.nextDouble();
        System.out.print("Vehicle depth: ");
        double depth= obj.nextDouble();
        System.out.println();
        vehicle=new Vehicle(model_name,model_year,id,width,depth);
    }

    public void reserve_slot()
    {
        int parking_slot;
        parking_slot=parking_method.check_suitable_parking_slot(vehicle);

        if (parking_slot==-1)
        {
            System.out.println("No suitable slots were found.");
            System.out.println();
        }
        else
        {
            parking_method.reserve_slot(parking_slot,vehicle);
        }
    }

    public void unresrve_slot(int vehicle_id)
    {
        int index=-1;
        for (int i = 0; i <garage.get_slots_no(); i++) {
            if (garage.slots[i].get_parked_vehicle_id()==vehicle_id)
            {
                index=i;

            }
        }
        if (index==-1)
        {
            System.out.println("No matching car id in garage");
            System.out.println();
        }
        else
        {
            garage.slots[index].time.capture_leaving_time();
            garage.slots[index].set_availability(true);
            garage.slots[index].set_vehicle_id(0);
            calculate_parking_fees(garage.slots[index]);

        }

    }

}
