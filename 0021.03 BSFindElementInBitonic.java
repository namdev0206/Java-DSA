public class BSFindElementInBitonic
{
    public static void main(String[] args)
    {
        //Bionic Array
        int arr[] = {2, 4, 6, 8, 11, 16, 13, 11, 9, 3, 1};

        findElementInBitonicArray(arr, 16);
    }

    public static void findElementInBitonicArray(int arr[], int target)
    {
        int index = findPeakElementInBitonicArray(arr);

        if(index == -1 || target > arr[index])
        {
            System.out.println("Element Does Not Exist");
        }
        else
        {
            if(target == arr[index])
            {
                System.out.println("Found " + arr[index] + " at : " + index);
                return;
            }

            int ans = binarySearch(arr, 0, index-1, target);

            if(ans == -1)
            {
                ans = binarySearchDesc(arr, index + 1, arr.length - 1, target);
            }

            if(ans == -1)
            {
                System.out.println("Element Does Not Exist");
            }
            else
            {
                System.out.println("Found " + arr[ans] + " at : " + ans);
            }
        }
    }


    public static int findPeakElementInBitonicArray(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end)
        {
            //Mid Element
            int mid = start + (end - start)/2;

            //Next Element
            int next = (mid + 1) % arr.length;

            //Previous Element
            int prev = (mid - 1 + arr.length) % arr.length;

            if(arr[mid] > arr[prev] && arr[mid] > arr[next])
            {
                return mid;
            }
            else if(arr[mid] > arr[prev])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }

        return -1;
    }


    public static int binarySearch(int arr[], int start, int end, int target)
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



    public static int binarySearchDesc(int arr[], int start, int end, int target)
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
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }

        return ans;
    }
}