public class BSBitonicArray
{
    public static void main(String[] args)
    {
        //Bionic Array
        int arr[] = {2, 4, 6, 8, 11, 16, 13, 11, 9, 3, 1};

        findMinElementInBitonicArray(arr);
    }

    public static void findMinElementInBitonicArray(int arr[])
    {
        if(arr.length == 0)
        {
            System.out.println("Array is Empty");
        }
        else if(arr.length == 1)
        {
            System.out.println("Minimum Element is : " + arr[0]);
        }
        else
        {
            int res = (arr[0] < arr[arr.length - 1])?arr[0]:arr[arr.length - 1];
            System.out.println("Min Element is : " + res);
        }
    }
}
