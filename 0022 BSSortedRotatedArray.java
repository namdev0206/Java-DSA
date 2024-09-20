public class BSSortedRotatedArray
{
    public static void main(String[] args)
    {
        int arr[] = {2, 4, 5, 7, 11, 43};

        //int index = minElement(arr);
        //System.out.println("Minimum Element in the Arrays is : " + arr[index]);

        int index1 = maxElement(arr);
        System.out.println("Maximum Element in the Arrays is : " + arr[index1]);

        rotationCountInCWSA(arr);

        rotationCountInACWSA(arr);

        int index2 = searchInRotatedArray(arr, 66);

        if(index2 == -1)
        {
            System.out.println("Element does not Exist.");
        }
        else

                System.out.println(arr[index2]);

    }

    public static void rotationCountInACWSA(int arr[])
    {
        int index = minElement(arr);
        System.out.println("Anti Clock Wise Rotation Count is : " + ((arr.length -index) % arr.length));
    }

    public static void rotationCountInCWSA(int arr[])
    {
        int index = minElement(arr);
        System.out.println("Clock Wise Rotation Count is : " + index);
    }


    public static int searchInRotatedArray(int arr[], int target)
    {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(target == arr[mid])
            {
                return mid;
            }

            //Left side is Sorted
            if(arr[start] <= arr[mid])
            {
               //Can Ans be found in Left Side?
                if((target >= arr[start])  &&  (target < arr[mid]))
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            //Right side is Sorted
            else
            {
                //Can Ans be found in Right Side?
                if((target > arr[mid])  &&  (target <= arr[end]))
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }


    public static int maxElement(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            int mid = start + (end - start)/2;

            if((mid < arr.length - 1) && (arr[mid] > arr[mid + 1]))
            {
                return mid;
            }
            //If Right Side is Sorted, Move Left
            else if(arr[start] > arr[mid])
            {
                end = mid - 1;
            }
            //If Left Side is Sorted, Move Right
            else
            {
                start = mid + 1;
            }
        }
        return end;
    }



    public static int minElement(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            int mid = start + (end - start)/2;

            if(mid > 0 && arr[mid] < arr[mid - 1])
            {
                return mid;
            }
            //If Right Side is Sorted, Move Left
            else if(arr[end] > arr[mid])
            {
                end = mid - 1;
            }
            //If Left Side is Sorted, Move Right
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }



    public static int minElementDuplicates(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            int mid = start + (end - start)/2;

            if(arr[start] == arr[mid] && arr[mid] == arr[end])
            {
                start++;
                end--;
            }
            else if(mid > 0 && arr[mid] < arr[mid - 1])
            {
                return mid;
            }
            //If Right Side is Sorted, Move Left
            else if(arr[end] >= arr[mid])
            {
                end = mid - 1;
            }
            //If Left Side is Sorted, Move Right
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }
}
