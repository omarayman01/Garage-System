/* Members:-
 * Name:                    id:
 * Ahmed Waleed Shawky      20200060
 * Omar ayman saied         20200343
 * Hadeer Ahmed Hamada      20210616
 * Huda Muhammad Rashed     20200620
 */

import java.util.Scanner;
import java.time.LocalTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Time {
    //Attributes
    private double entering_hour,entering_min;
    private double leaving_hour,leaving_min;
    private double time_spent_in_hours;


    public void capture_entering_time()  //A function that captures and stores the time when the car entered the garage automatically from the system
    {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        char hour_1= strDate.charAt(11);
        char hour_2= strDate.charAt(12);
        String hour_string =Character.toString(hour_1)+Character.toString(hour_2);
        int hour=Integer.parseInt(hour_string);
        char min_1= strDate.charAt(14);
        char min_2= strDate.charAt(15);
        String min_string =Character.toString(min_1)+Character.toString(min_2);
        int min=Integer.parseInt(min_string);
        entering_hour=hour;
        entering_min=min;
        System.out.println("Your vehicle entered the garage at " +(int)entering_hour+ ":" +(int)entering_min);
    }

    public void capture_leaving_time()   //A function that captures and stores the time when the car leaves the garage automatically from the system
    {
        //the part responsible for capturing leave time
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate = dateFormat.format(date);
        char hour_1= strDate.charAt(11);
        char hour_2= strDate.charAt(12);
        String hour_string =Character.toString(hour_1)+Character.toString(hour_2);
        int hour=Integer.parseInt(hour_string);
        char min_1= strDate.charAt(14);
        char min_2= strDate.charAt(15);
        String min_string =Character.toString(min_1)+Character.toString(min_2);
        int min=Integer.parseInt(min_string);
        leaving_hour=hour;
        leaving_min=min;
        System.out.println("Your vehicle leaved the garage at " +(int)leaving_hour+ ":" +(int)leaving_min);
        calculate_time_spent();
    }

    public void calculate_time_spent()      // function that calculates fees of parking and time stayed by the vehicle in the garage.
    {

        double hours_in_garage;
        if (entering_min>leaving_min)
        {
            hours_in_garage=(Math.abs((leaving_hour-1)-entering_hour)+(Math.abs((leaving_min+60)-entering_min)/60));
        }
        else
        {
            hours_in_garage=(Math.abs((leaving_hour)-entering_hour)+(Math.abs((leaving_min)-entering_min)/60));
        }
        time_spent_in_hours=hours_in_garage;
        System.out.println("you stayed for: "+String.format("%.2f",hours_in_garage)+" hours which is equal to: "+String.format("%.1f",(hours_in_garage*60))+" minutes");
    }

    public double get_time_spent_in_hours(){return time_spent_in_hours;}



}
