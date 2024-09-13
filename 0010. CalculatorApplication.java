import java.util.*;

public class CalculatorApplication
{
    //Main Function
    public static void main(String[] args)
    {
        CalculatorApplication obj = new CalculatorApplication();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Calculator, By Namdev Panchal");
        do
        {
            System.out.println("Choose an Operation:  (*, +, -, %, /)");
            System.out.print("--> ");

            //Take input from User Decide which operation to Perform
            String input = sc.next();
            char ch = input.charAt(0);
            //Check Input is Valid
            if(input.length() != 1)
            {
                System.out.println("Wrong input, try again");
            }
            else
            {
                obj.chooseOperation(ch);
            }

            boolean exit = obj.exitProgram();

            if(exit)
            {
                break;
            }

        }while(true);

        System.out.println("Thanks for using our service");
    }



    //Exit Program Function
    public boolean exitProgram()
    {
        Scanner sc = new Scanner(System.in);
        int times = 0;
        int retry = 5;

        for(times = 0; times < retry; times++)
        {
            System.out.println("Do you want to Continue? (Y/N)");
            String exitInput = sc.next();
            char ch1 = exitInput.charAt(0);

            if(exitInput.length() == 1 && (ch1 == 'n' || ch1 == 'N'))
            {
                return true;
            }
            else if(exitInput.length() == 1 && (ch1 == 'y' || ch1 == 'Y'))
            {
                return false;
            }
            else
            {
                System.out.println("Wrong input, try again");
            }
        }

        if(times >= retry)
        {
            System.out.println("Maximum retry count Exceeded! Exiting Forcefully");
            return true;
        }
        return false;
    }


    public int getInteger()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    //Choose Operation Function
    public void chooseOperation(char ch)
    {
        switch (ch)
        {
            case '*':
                System.out.print("Enter the First Number -> ");
                int num1 = getInteger();
                System.out.print("Enter the Second Number -> ");
                int num2 = getInteger();
                System.out.println("Multiply Result -> " + (num1*num2));
                break;

            case '+':
                System.out.print("Enter the First Number -> ");
                int num3 = getInteger();
                System.out.print("Enter the Second Number -> ");
                int num4 = getInteger();
                System.out.println("Addition Result -> " + (num3+num4));
                break;

            case '-':
                System.out.print("Enter the First Number -> ");
                int num5 = getInteger();
                System.out.print("Enter the Second Number -> ");
                int num6 = getInteger();
                System.out.println("Subtraction Result -> " + (num5-num6));
                break;

            case '/':
                System.out.print("Enter the First Number -> ");
                int num7 = getInteger();
                System.out.print("Enter the Second Number -> ");
                int num8 = getInteger();

                if (num8 == 0)
                {
                    System.out.println("Divide by Zero Error!");
                    break;
                }
                System.out.println("Division Result -> " + (num7/num8));
                break;

            case '%':
                System.out.print("Enter the First Number -> ");
                int num9 = getInteger();
                System.out.print("Enter the Second Number -> ");
                int num10 = getInteger();

                if (num10 == 0)
                {
                    System.out.println("Divide by Zero Error!");
                    break;
                }
                System.out.println("Modulo Result -> " + (num9%num10));
                break;

            default:
                System.out.println("Unknown Operation");
        }
    }
}