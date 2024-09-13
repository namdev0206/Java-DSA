public class BinarySearch2
{
    public static void main(String[] args)
    {
            //Accending Order Array
            int arr[] = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
            int target = -18;
            int ans = binaarySearch(arr, target);
            System.out.println(ans);
    }


    //Accending Order Binary Search
    //Return the Index
    //Return -1 if it does not exist
    public static int binaarySearch(int arr[], int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            //Find the Middle Element

            //Might be possible it will Exceeds the Range of the Integer in Java
            //int mid = (start + end) / 2;  -- It has the Range in the Integer

            int mid = start + (end - start) / 2;

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
                //Ans Found
                return mid;
            }
        }

        return -1;
    }
}
