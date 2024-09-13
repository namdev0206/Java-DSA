public class BSLCQFloor5
{
    public static void main(String[] args)
    {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println("The Index of Floor of the target is : " + ans);
    }

    //Find the Ceiling of the Number
    //Return the Index of Greatest no >= target
    public static int floor(int arr[], int target)
    {
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
        return end;
    }
}
