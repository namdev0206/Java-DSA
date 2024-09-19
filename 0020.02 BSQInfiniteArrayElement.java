public class BSQInfiniteArrayElement
{
    public static void main(String[] args)
    {
        int arr[] = {2, 2, 4, 5, 7, 9, 25, 56, 88, 94};
        findElementInInfiniteSortedArray(arr, 57);
    }

    public static void findElementInInfiniteSortedArray(int arr[], int target)
    {
        int range[] = findRangeInInfiniteArray(arr, 10);

        int ans =binarySearchInRange(arr, 10, range[0], range[1]);

        if(ans == -1)
        {
            System.out.println("Element does not Exist");
        }
        else
        {
            System.out.println("Found element at Index : " + ans);
        }
    }

    public static int[] findRangeInInfiniteArray(int arr[], int target)
    {
        int range[] = new int[2];

        int start = 0;
        int end = 1;

        while(arr[end] < target)
        {
            start = end;
            end = 2 * end;
        }

        range[0] = start;
        range[1] = end;

        return range;
    }


    public static int binarySearchInRange(int arr[], int target, int start, int end)
    {
        int ans = -1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

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

        return ans;
    }
}