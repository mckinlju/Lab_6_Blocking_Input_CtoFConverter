import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;
        boolean done = false;

        do
        {
            System.out.println("Please enter a temperature in Celsius: ");
            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                fahrenheit = (celsius * 9/5) + 32;
                done = true;
            }
            else
            {
                System.out.println("Please Enter a valid temperature not: " + celsius);
                in.next();
            }
        }while (!done);
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}