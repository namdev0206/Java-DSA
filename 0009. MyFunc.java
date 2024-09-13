//22.46

class Temp
{
    int myVar1 = 10;
}


class MyFunc
{
    public static void main(String args[])
    {
        MyFunc mf = new MyFunc();

    /*  Temp obj1 = new Temp();
        Temp obj2 = new Temp();

        obj1.myVar1 = 10;
        obj2.myVar1 = 20;
        mf.swapByRef(obj1, obj2);
        System.out.println("After Call " + obj1.myVar1 + " , " + obj2.myVar1);

        int num1 = 10;
        int num2 = 20;
        mf.swap(num1, num2);
        System.out.println(num1 + " , " + num2);

        mf.calculateArea(2, 5);
        System.out.println(res);  */

        int num1 = 10;
        int num2 = 20;
        mf.swap(num1, num2);
    }

    public void swap(int val1, int val2)
    {
        System.out.println("A = " + val1 + " , " + val2);
        int temp = val1;
        val1 = val2;
        val2 = temp;
        System.out.println(val1 + " , " + val2);
    }

    public void swap(long val1, long val2)
    {
        System.out.println("B = " + val1 + " , " + val2);
        long temp = val1;
        val1 = val2;
        val2 = temp;
        System.out.println(val1 + " , " + val2);
    }

    public void swap(long val1, int val2)
    {
        System.out.println("C = " + val1 + " , " + val2);
        long temp = val1;
        val1 = val2;
        val2 = (int)temp;
        System.out.println(val1 + " , " + val2);
    }

    public void swap()
    {
        System.out.println("Zyada ho raha hai");
    }


     public void swapByRef(Temp obj1, Temp obj2)
    {
        System.out.println("First : " + obj1.myVar1 + " , " + obj2.myVar1);

        obj1 = new Temp();
        obj1.myVar1 = 10;

        obj2 = new Temp();
        obj2.myVar1 = 20;

        System.out.println("Second : " + obj1.myVar1 + " , " + obj2.myVar1);

        int temp = obj1.myVar1;
        obj1.myVar1 = obj2.myVar1;
        obj2.myVar1 = temp;
        System.out.println(obj1.myVar1 + " , " + obj2.myVar1);
    }

    //No Return
    public void calculateArea(int length, int width)
    {
        //System.out.println(length * width);
        int area = length * width;
        return;
    }
}