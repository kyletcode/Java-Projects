
public class H1AverageSpeed {

	public static void main(String[] args) {
		
        double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double distanceInMiles = 24;
        
        double distanceInKilometers = distanceInMiles * 1.6;
        System.out.println("Distance of miles converted to total kilometers = " + distanceInKilometers);
        
        double timeInMinutes = hours * 60.0 + minutes + seconds / 60.0;
        System.out.println("Total time converted into minutes = " + timeInMinutes);

        double kilometersPerHour = 60.0 * distanceInKilometers / timeInMinutes;

        System.out.println("Average Speed in Kilometers is: " + kilometersPerHour + " per hour");
		
	}

}
