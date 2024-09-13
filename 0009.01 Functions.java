import java.util.*;

public class Functions
{
    public static int calculateSum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }


    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Value of A    : ");
        int a = input.nextInt();

        System.out.println("Enter the Value of B    : ");
        int b = input.nextInt();

        int sum1 = calculateSum(a, b);
        System.out.println("Sum of A and B is " + sum1);
    }
}