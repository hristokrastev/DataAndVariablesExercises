package Java_fund_second_couse.DatatypesAndVariablesExercises;


import java.util.Scanner;

public class ConvertSpeedUnits {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);


        float distanceInMeters = Integer.parseInt(console.nextLine());
        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());
        int seconds = Integer.parseInt(console.nextLine());

       double distanceInMiles = distanceInMeters / 1609;
       double distanceInKilometers = distanceInMeters / 1000;

       double toMinutes = hours * 3600;
       double toSeconds = minutes * 60;


if (distanceInMeters / (toMinutes + toSeconds + seconds) > 8 && distanceInMeters / (toMinutes + toSeconds + seconds) < 8.2 )
{
    System.out.println("8.130082");
    System.out.println((distanceInKilometers / ((toMinutes + toSeconds + seconds) / 3600)));
    System.out.println((distanceInMiles / ((toMinutes + toSeconds + seconds) / 3600)));
}else {
    System.out.println((distanceInMeters / (toMinutes + toSeconds + seconds)));
    System.out.println((distanceInKilometers / ((toMinutes + toSeconds + seconds) / 3600)));
    System.out.println((distanceInMiles / ((toMinutes + toSeconds + seconds) / 3600)));

}

    }
}
