import java.util.Scanner;

public class fibonacci
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms for Fibonacci series:");

        int n = scanner.nextInt();

        System.out.println("Fibonacci series up to  the " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}