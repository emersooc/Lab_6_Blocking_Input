import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        boolean done = false; //boolean variable control while loop
        double tempC = 0; //variable for C temp

        do
        {
            Scanner userInput = new Scanner(System.in); //creates scanner object
            System.out.println("Enter a temperature in Celsius: ");

            if (userInput.hasNextDouble()) //tests if input is a double
            {
                tempC = userInput.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Not a valid temperature");
            }
        }
        while (!done);

        //converts to F then outputs result
        double tempF = (tempC * 1.8) + 32;

        System.out.printf("The entered temperature in Fahrenheit is %.2f F",tempF);
    }
}
