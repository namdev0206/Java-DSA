public class BinarySearch1
{
    public static void main(String[] args)
    {
        //Increasing Order Array
        int arr[] = {2, 5, 7, 11, 45, 87, 90};
        //binarySearchInc(arr, 87);

        //Decreasing Order Array
        int arr2[] = {90, 87, 54, 36, 22, 1};
        //binarySearchDec(arr2, 54);


        //Binary Search Order Agnostic
        binarySearchOrderAgnostic(arr2, 54);

        binarySearchOrderAgnostic(arr, 87);
    }

    //Binary Search Increasing Order
    public static void binarySearchInc(int arr[], int target)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            //Formula to find mid in the Array
            int mid = (start + ((end - start)/2));

            if(arr[mid] == target)
            {
                ans = mid;
                break;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }

        if(ans == -1)
        {
            System.out.println("Element is not Present in the Array");
        }
        else
        {
            System.out.println("Found element " + target + " at index : " + ans);
        }
    }


    //Binary Search Decreasing Order
    public static void binarySearchDec(int arr[], int target)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            //Formula to find mid in the Array
            int mid = (start + ((end - start)/2));

            if(arr[mid] == target)
            {
                ans = mid;
                break;
            }
            else if(arr[mid] < target)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }

        if(ans == -1)
        {
            System.out.println("Element is not Present in the Array");
        }
        else
        {
            System.out.println("Found element " + target + " at index : " + ans);
        }

    }


    public static void binarySearchOrderAgnostic(int arr[], int target)
    {
        int start = 0;
        int end = arr.length - 1;

        if(arr[start] <= arr[end])
        {
            binarySearchInc(arr, target);
        }
        else
        {
            binarySearchDec(arr, target);
        }
    }
}
