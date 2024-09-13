public class LearnMethod1
{
    public static void main(String args[])
    {
        //greet();
        int avgfunc = average(4, 6);
        int doublefunc = avgfunc * 2;
        System.out.println("Hello Delhi");
        System.out.println(doublefunc); 
    }

/*
    //No Return Method
    public void greet()
    {
        System.out.println("Hello World!");
    }

    //No Return Method
    public static void average(int a, int b)
    {
        int avg = (a + b) / 2;
        System.out.println("The average is " + avg);
    }
*/


    //Return Method
    public static int average(int a, int b)
    {
        int avg = (a + b) / 2;
        return avg;
    }
}