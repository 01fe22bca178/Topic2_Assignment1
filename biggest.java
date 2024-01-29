/**
 * The "biggest" class takes three numbers as input and outputs the largest number among them.
 */
import java.util.Scanner;

/**
 * The "biggest" class takes three numbers as input and outputs the largest number among them.
 */
public class biggest
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  the three numbers:");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double largest = Math.max(Math.max(num1, num2), num3);

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}

