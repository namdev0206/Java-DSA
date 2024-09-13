public class OperatorLec 
{    
    public static void main(String args[])
    {
        //Unary Operators
        int op1 = 10;
        //op1++;
        op1--;

        //Pre Increment
        int y = --op1;
        int x = ++op1;
        System.out.println(op1 + " " + x + " " + y);

        //Post Increment
        int z = op1++;
        int a = op1--;
        System.out.println(op1 + " " + z + " " + a);


        int op = 15;
        int ans = op++ + ++op - --op - op++;
        System.out.println(op + " " + ans);
    }
}
