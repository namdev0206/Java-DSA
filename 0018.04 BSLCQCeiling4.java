public class BSLCQCeiling4
{
    public static void main(String[] args)
    {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println("The Index of Ceiling of the target is : " + ans);
    }

    //Find the Ceiling of the Number
    //Return the Index of smallest no >= target
    public static int ceiling(int arr[], int target)
    {
        //But what if the Target is Greater than the Greatest number in the Array
        if(target > arr[arr.length - 1])
        {
            return -1;
        }


        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            //Find the Middle Element
            int mid = start + (end - start)/2;

            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return start;
    }
}