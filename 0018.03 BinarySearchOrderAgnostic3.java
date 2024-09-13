public class BinarySearchOrderAgnostic3
{
    public static void main(String[] args)
    {
        //int arr[] = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int arr[] = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;

        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    public static int orderAgnosticBS(int arr[], int target)
    {
        int start = 0;
        int end = arr.length - 1;


        //Find whether the Array is Sorted in Ascending or Descending
        boolean isAsc;

        if(arr[start] < arr[end])
        {
            isAsc = true;
        }
        else
        {
            isAsc = false;
        }

        while(start <= end)
        {
            //Find the Middle Element
            //Might be possible it will Exceeds the Range of the Integer in Java
            //int mid = (start + end) / 2;  -- It has the Range in the Integer

            int mid = start + (end - start) / 2;


            if(arr[mid] == target)
            {
                return mid;
            }


            if(isAsc)
            {
                if(target < arr[mid])
                {
                    end = mid - 1;
                }
                else if(target > arr[mid])
                {
                    start = mid + 1;
                }
            }
            else
            {
                if(target > arr[mid])
                {
                    end = mid - 1;
                }
                else if(target < arr[mid])
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}