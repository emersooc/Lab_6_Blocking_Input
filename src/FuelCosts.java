import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        boolean done = false; //boolean to control while loops
        //variables for prompts
        double inTank = 0;
        double fuelEfficiency = 0;
        double priceGas = 0;

        //other variables
        double cost100;
        double currentDistance;

        do
        {
            Scanner userInput = new Scanner(System.in); //creates scanner object
            System.out.println("Gallons of gas in tank: ");

            if (userInput.hasNextDouble()) //tests if input is a double
            {
                inTank = userInput.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Not a valid number");
            }
        }
        while (!done);
        done = false; //resets done to false

        do
        {
            Scanner userInput = new Scanner(System.in); //creates scanner object
            System.out.println("Fuel efficiency of vehicle(mpg): ");

            if (userInput.hasNextDouble()) //tests if input is a double
            {
                fuelEfficiency = userInput.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Not a valid number");
            }
        }
        while (!done);
        done = false; //resets done to false

        do
        {
            Scanner userInput = new Scanner(System.in); //creates scanner object
            System.out.println("Price of gas(usd): ");

            if (userInput.hasNextDouble()) //tests if input is a double
            {
                priceGas = userInput.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Not a valid number");
            }
        }
        while (!done);

        //cost per 100 miles
        cost100 = (100 / fuelEfficiency) * priceGas;
        System.out.printf("It will cost $%.2f to travel 100 miles %n",cost100);

        //distance on current tank
        currentDistance = inTank * fuelEfficiency;
        System.out.printf("You can travel %.2f miles on your current tank",currentDistance);
    }
}
