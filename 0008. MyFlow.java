class MyFlow
{
    public static void main(String args[])
    {
        int marks = 89;

        if(marks >= 90)
        {
        System.out.println("You are topper as you have secured : " + marks);
        }
        else if(marks > 35 && marks < 90)
        {
        System.out.println("Your Marks is : " + marks + " Passed");
        }
        else
        {
        System.out.println("You have Scored only " + marks + " improvement needed");
        }



        // To Find the correct location of Character
        String name = "shashwat";
        name.charAt(1);


        //To skip the Iteration in Loop
        for(int num = 2; num < 4; num++)
        {
            for(int times = 1; times <= 10; times++)
            {
                if(times == 5)
                {
                    //Jump Statements
                    continue;
                    break;
                }
            }
        } 



    }
}