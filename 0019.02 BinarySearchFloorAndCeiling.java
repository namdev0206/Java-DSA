public class BinarySearchFloorAndCeiling
{
    public static void main(String[] args)
    {
        int arr[] = {4, 4, 8, 8, 15, 16, 23, 23, 42};

        int ans = floorOfNumber(arr, 17);
        System.out.println("Floor is : " + ans);

        int ans1 = ceilingOfNumber(arr, 17);
        System.out.println("Ceiling is : " + ans1);
    }

    public static int floorOfNumber(int arr[], int target)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                ans = arr[mid];
                break;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;

                ans = arr[mid];
            }
            else
            {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static int ceilingOfNumber(int arr[], int target)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                ans = arr[mid];
                break;
            }
            else if(arr[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
                ans = arr[mid];
            }
        }

        return ans;
    }
}
