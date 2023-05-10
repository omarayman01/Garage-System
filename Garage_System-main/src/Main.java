import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);

        //making an object named owner that represents Garage owner actions
        Garage_owner_actions garage_owner_actions=new Garage_owner_actions();
        garage_owner_actions.set_up_garage();
        Vehicle_action vehicle_action = new Vehicle_action();

        int interface_option=0;

        //making an options menu.
        while (interface_option!=5)
        {
            System.out.println("Options for Vehicle driver:");
            System.out.println("------------------------------------------");
            System.out.println("1- Park a vehicle in the garage");
            System.out.println("2- Park out a vehicle from the garage");
            System.out.println();
            System.out.println("Options for Garage owner:");
            System.out.println("------------------------------------------");
            System.out.println("3- Display all available Slots and their dimensions");
            System.out.println("4- Display total income and total number of vehicles");
            System.out.println("5- Exit program");
            System.out.print("Chosen option: ");
            interface_option=obj.nextInt();
            System.out.println();

            if (interface_option==1) {

                //call functions responsible for parking a vehicle.
                vehicle_action.park_in();
            }
            else if (interface_option==2) {

                //call functions responsible for vehicle to leave.
                vehicle_action.park_out();
            }
            else if (interface_option==3) {

                //call function responsible for displaying available slots in garage.
                garage_owner_actions.display_available_slots();
            }
            else if (interface_option==4) {

                //call function that checks total income and total number of vehicles that entered the garage.
                garage_owner_actions.display_total_income_and_vehicle_no();
            }

        }



    }
}