import java.util.Scanner;
import java.lang.Math;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        boolean done = false; //boolean to control while loops

        //variables for L, W, and unit
        double width = 0;
        double length = 0;
        String unit = "";

        //other variables
        double area;
        double perimeter;
        double diagonal;

        do
        {
            Scanner userInput = new Scanner(System.in); //creates scanner object
            System.out.println("Enter the units of the rectangle(in,m,cm,...: ");

            if (userInput.hasNextLine()) //tests if input is a string
            {
                unit = userInput.nextLine();
                done = true;
            }
            else
            {
                System.out.println("Not a valid unit");
            }
        }
        while (!done);
        done = false; //resets done to false

        do
        {
            Scanner userInput = new Scanner(System.in); //creates scanner object
            System.out.println("Enter its length: ");

            if (userInput.hasNextDouble()) //tests if input is a double
            {
                length = userInput.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Not a valid length");
            }
        }
        while (!done);
        done = false; //resets done to false

        do
        {
            Scanner userInput = new Scanner(System.in); //creates scanner object
            System.out.println("Enter its width: ");

            if (userInput.hasNextDouble()) //tests if input is a double
            {
                width = userInput.nextDouble();
                done = true;
            }
            else
            {
                System.out.println("Not a valid width");
            }
        }
        while (!done);

        //area of rectangle
        area = length * width;
        System.out.printf("The area of the rectangle is %.2f square "+ unit + "%n",area);

        //perimeter of rectangle
        perimeter = 2 * (length + width);
        System.out.printf("The perimeter of the rectangle is %.2f "+ unit + "%n",perimeter);

        //diagonal of rectangle
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.printf("The diagonal of the rectangle is %.2f "+ unit,diagonal);
    }
}
