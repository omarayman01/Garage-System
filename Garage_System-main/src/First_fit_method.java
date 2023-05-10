public class First_fit_method extends Parking_method {
    private Garage garage;
    public First_fit_method()
    {
        this.garage=Garage_operations.garage;
    }

    @Override
    public int check_suitable_parking_slot(Vehicle vehicle)
    {
        for (int i = 0; i <garage.get_slots_no(); i++) {

            if (garage.slots[i].is_empty() && garage.slots[i].get_width()>=vehicle.get_width() && garage.slots[i].get_depth()>=vehicle.get_depth())
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void reserve_slot(int slot_no,Vehicle vehicle) {
        garage.slots[slot_no].set_vehicle_id(vehicle.get_id());
        garage.slots[slot_no].set_availability(false);
        garage.increment_vehicle_counter();
        garage.slots[slot_no].time.capture_entering_time();
        System.out.println("Please park your vehicle at slot number: "+(slot_no+1));
        System.out.println();
    }
}
