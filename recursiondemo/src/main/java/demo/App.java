package demo;

import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int x;
        int n;
        float result;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number for x: ");
        x = scanner.nextInt();
        System.out.println("Your base is: " + x);
        System.out.println("Enter a power number for n: ");
        n = scanner.nextInt();
        System.out.println("Your power is: " + n);

        result = powerN(x, n);

        System.out.println("The result: is: " + result);
    
    }
    
    public static int powerN(int x, int n)
    {
        if (n != 0) {
          return (x * powerN(x, n - 1));
        }
        else {
            return 1;
        }
    }
}