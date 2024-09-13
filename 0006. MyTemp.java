import java.util.Scanner;


public class MyTemp
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        // System.out.println("What is your name = ");
        //To take a input for First name Only
        //String firstName = input.next();
        //System.out.println("Hi FN " + firstName);


        System.out.println("What is your age = ");
        String ageInput = input.next();

        //Integer Class
        int age = Integer.parseInt(ageInput);  //Convert String into Integer

        //To Create the Object
        Integer myAge = Integer.valueOf(age);

        System.out.println("What is your Address ? ");
        input.nextLine();  //Just to Ignore \n 
        String address = input.nextLine();


        System.out.println("Hi " + age + " Address " + address);

        //To take a input for whole name
        //String name = input.nextLine(); //'\n'
        //System.out.println("Hi " + name);
        input.close();
    }
}