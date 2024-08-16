
package ue.tausicoach;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Asecondcoach {
    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance in km
        double speedMps = 225.5; // Speed in m/s

        // Convert speed from m/s to km/hr
        double speedKmph = speedMps * 3.6;

        // Calculate travel time in hours
        double travelTime = (double) totalDistance / speedKmph;

        // Initial departure time
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date departureTime;
        try {
            departureTime = sdf.parse("09:00:00");
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        // Calculate arrival time
        long departureTimeInMillis = departureTime.getTime();
        long travelTimeInMillis = (long) (travelTime * 3600000); // Convert hours to milliseconds
        Date arrivalTime = new Date(departureTimeInMillis + travelTimeInMillis);

        // Print the results
        System.out.println("Approximate arrival time: " + sdf.format(arrivalTime));
    }
}
    
