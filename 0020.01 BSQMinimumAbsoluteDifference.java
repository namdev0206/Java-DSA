public class BSQMinimumAbsoluteDifference
{
    public static void main(String[] args)
    {
        int arr[] = {2, 2, 4, 5, 7, 9, 25, 56, 88, 94};
        minimumAbsoluteDifference(arr, 50);
    }


    public static void minimumAbsoluteDifference(int arr[], int target)
    {
        if(arr.length == 0)
        {
            return;
        }

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <=end)
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

        //If element exists then ans will be Zero
        int res = 0;

        //Element does not exist in the Array
        if(ans == -1)
        {
            if(end == -1)
            {
                res = Math.abs(target - arr[start]);
            }
            else if(start == arr.length)
            {
                res = Math.abs(target - arr[end]);
            }
            else
            {
                int ans1 = Math.abs(target - arr[start]);
                int ans2 = Math.abs(target - arr[end]);

                res = (ans1 < ans2)?ans1:ans2;
            }
        }

        System.out.println("The Minimum Absolute Difference of the Given Target in the Array is : " + res);
    }
}
