import java.util.*;

public class MathForDSA2
{
    public static void main(String args[])
    {
        //countDigitd(45678);

        //countDigitViaLog(7894);

        //armstrongNumber(153);

        //printAllDivisors(36);

        //primeNumbers(25);

        //sieveAlgorithm(40);

        //GCD(24,36);

        euclideanGCD(24,36);
    }

    //Count with Normal Code
    public static void countDigitd(int num)
    {
        if(num == 0)
        {
            System.out.println("Digits are :");
            return;
        }

        int count = 0;

        while(num > 0)
        {
            num = num / 10;
            count++;
        }

        System.out.println("Digits are " + count);
    }


    //Count via Log - DSA
    public static void countDigitViaLog(int num)
    {
        if(num == 0)
        {
            System.out.println("Digits are : 1");
            return;
        }

        //Change log base = Base is already 10
        //Math.log(num) / Math.log(10);

        //int count = (int)((int) Math.log(num) / Math.log(10)) + 1;
        int count = (int)Math.log10(num) + 1;

        System.out.println("Digits are : " + count);
    }


    //Armstrong Number
    public static void armstrongNumber(int num)
    {
        int res = 0;
        int copy = num;

        while(num > 0)
        {
            int digit = num % 10;
            res = res + (int)Math.pow(digit, 3);

            num = num / 10;
        }

        System.out.println(res == copy);


    }


    //Print all Divisors
    public static void printAllDivisors(int num)
    {
        int counter = 1;

        int sqroot = (int)newtonRaphsonSqRoot(num); //Math.sqrt(num);

        while(counter <= sqroot)
        {
            if(num % counter == 0)
            {
                System.out.println(counter + " is a Divisor of " + num);

                int otherNumber = num/counter;
                if(otherNumber != counter)
                {
                    System.out.println(otherNumber + " is a Divisor of " + num);
                }
            }

            counter++;
        }
    }


    //Prime NUmber
    public static void primeNumbers(int num)
    {
        //Check from 2-Sqrt of Number

        int counter = 2;

        int sqroot = (int)Math.sqrt(num);

        while(counter <= sqroot)
        {
            if(num%counter == 0 )
            {
                System.out.println(num + " is a Not a Prime Number");
                return;
            }
            counter++;
        }

        System.out.println(num + " is a Prime Number");
    }


    //Check Range of Prime Number -- Sieve Algorithm
    public static void sieveAlgorithm(int num)
    {
        boolean arr[] = new boolean[num + 1];

        //Predefined Function -- To fill all the Array at 1 Time
        Arrays.fill(arr, true);

        int counter = 2;

        while(counter <= num)
        {
            if(arr[counter] == true)
            {
                for(int factor = counter+counter; factor <= num; factor = factor+counter)
                {
                    arr[factor] = false;
                }
            }

            counter++;
        }

        for(int i = 2; i <= num; i++)
        {
            if(arr[i] == true)
            {
                System.out.println(i + " is a Prime Number");
            }
            //System.out.println(i + " : " + arr[i]);
        }
    }


    //Find SquareRoot for Better Time Complexity
    public static double newtonRaphsonSqRoot(int num)
    {
        double root;
        double X = num;
        double tol = 0.0001;

        while(true)
        {
            root = 0.5 * (X + num/X);
            double ans = X - root;
            if(ans < tol)
            {
                break;
            }
            X = root;
        }
        return root;
    }


    //Find GCD (Greatest Common Division) of two Numbers
    public static void GCD(int num1, int num2)
    {
        int min = (num1 <= num2)?num1:num2;

        while(min > 0)
        {
            if(num1%min == 0 && (num2&min) == 0)
            {
                System.out.println("GCD is : " + min);
                return;
            }
            min--;
        }
        int max = (num1 <= num2)?num2:num1;
        System.out.println("GCD is Max: " + max);
    }


    public static void euclideanGCD(int num1, int num2)
    {
        while(num1 != 0 && num2 != 0)
        {
            if(num1>num2)
            {
                num1 = num1 - num2;
            }
            else
            {
                num2 = num2 - num1;
            }
        }

        int res = num1;
        if(num1 == 0)
        {
            res = num2;
        }
        System.out.println("GCD is: "+ res);
    }
}