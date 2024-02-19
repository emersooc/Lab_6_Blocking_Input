import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        boolean done = false; //boolean to control while loop

        double meters = 0; //variable for user input

        //unit variables
        double miles;
        double feet;
        double inches;

        do
        {
            Scanner userInput = new Scanner(System.in); //creates scanner object
            System.out.println("Enter a measurement in meters: ");

            if (userInput.hasNextDouble()) //tests if input is a double
            {
                meters = userInput.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Not a valid measurement");
            }
        }
        while (!done);

        //meters to miles
        miles = meters / 1609.344;
        System.out.printf("%.2f meters is %.3f miles %n",meters, miles);

        //meters to feet
        feet = meters * 3.2808;
        System.out.printf("%.2f meters is %.3f feet %n",meters, feet);

        //meters to inches
        inches = meters * 39.3701;
        System.out.printf("%.2f meters is %.3f inches",meters, inches);
    }
}
