public class BinarySearchQuestions
{
    public static void main(String[] args)
    {
        //int arr1[] = {2, 2, 2, 4, 4, 4, 6, 8, 9};
        int arr[] = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
        int res[] = new int[2];
        int first = FirstOccurance(arr, 60, true);
        int last = FirstOccurance(arr, 60, false);

        if(first == -1)
        {
            System.out.println("Occurrence of Target is : 0");
        }
        else
        {
            System.out.println("Occurrence of Target is : " + (last - first + 1));
        }


        //res[0] = first;
        //res[1] = last;
    }

    public static int FirstOccurance(int arr[], int target, boolean isFirst)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == target)
            {
                ans = mid;

                if(isFirst)
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }

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
//        if(ans == -1)
//        {
//            System.out.println("Element not Found");
//        }
//        else
//        {
//            System.out.println("Found Element " + arr[ans] + " at Index " + ans);
//        }
    }
}
