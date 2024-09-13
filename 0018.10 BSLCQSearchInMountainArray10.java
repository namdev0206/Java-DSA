public class BSLCQSearchInMountainArray10
{
    public static void main(String[] args)
    {
        int arr[] = {0, 2, 3, 5, 7, 9, 11, 18, 200, 100, 90, 85, 70, 50, 30, 25, 15, 10, 5, 1, 0};
        int target = 199;
        int result = search(arr, target);
        if (result != -1)
        {
            System.out.println("The target " + target + " is found at index : " + result);
        }
        else
        {
            System.out.println("The target " + target + " is not found in the array.");
        }
    }

    public static int search(int arr[], int target)
    {
        int peak = peakIndexInMountainArray(arr);

        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if(firstTry != -1)
        {
            return firstTry;
        }
        //Try to Search in Second Half
        return orderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }


    public static int peakIndexInMountainArray(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1])
            {
                //You are in Decreasing part of the Array
                //Maybe the ans, but look at left
                //This is why end != mid - 1
                end = mid;
            }
            else
            {
                //You are in Ascending part of the Array
                start = mid + 1;  //Because we know that mid + 1 element > mid element
            }
        }

        //In the End, Start == End and pointing to the Largest Number Because of the 2 Checks above
        //Start and End are always trying to find Max element int the above 2 Checks
        //Hence, when they are pointing to just one Element, that is the Max one Because that is what the Checks Say
        //More Elaboration : At every point of Start and End, they havethe best possible ans till that time
        //And if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans

        return start; //or return end because Both are Equal
    }


    public static int orderAgnosticBS(int arr[], int target, int start , int end)
    {
        //Find wheather the array is Sorted in Ascending or Descending Order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end)
        {
            //Find the Middle Element
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
                else
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
                else
                {
                    start = mid + 1;
                }
            }
        }
        return - 1;
    }
}

