public class BSLCQInfiniteArray8
{
    public static void main(String[] args)
    {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));

    }

    public static int ans(int arr[], int target)
    {
        //First find the Range
        //Start with the Box of Size 2
        int start = 0;
        int end = 1;

        //Condition for the target to lie int the Range
        //Till your target is Greater than end Keep doubling it
        while(target > arr[end])
        {
            int temp = end + 1;

            //Double the Box Value
            //end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;

            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }


    public static int binarySearch(int arr[], int target, int start, int end)
    {

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
        return -1;
    }
}