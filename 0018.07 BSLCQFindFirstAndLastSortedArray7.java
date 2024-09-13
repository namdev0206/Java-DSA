public class BSLCQFindFirstAndLastSortedArray7
{
    public static void main(String[] args)
    {
        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int ans[] = searchRange(nums, target);
        System.out.println("The indexes at : [" + ans[0] + ", " + ans[1] + "]");
    }

    public static int[] searchRange(int nums[], int target)
    {
        int ans[] = {-1, -1};

        // Check for First Occurance of Target First
       int start = search(nums, target, true);

       int end = search(nums, target, false);

       ans[0] = start;
       ans[1] = end;

       return ans;
    }


    //THis function Just Return the Index Value of Target
    public static int search(int nums[], int target, boolean findStartIndex)
    {
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if(target < nums[mid])
            {
                end = mid - 1;
            }
            else if(target > nums[mid])
            {
                start = mid + 1;
            }
            else
            {
                //Potential ans Found
                ans = mid;

                if(findStartIndex == true)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}