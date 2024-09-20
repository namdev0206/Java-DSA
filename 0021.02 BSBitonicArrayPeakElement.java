public class BSBitonicArrayPeakElement
{
    public static void main(String[] args)
    {
        //Bionic Array
        int arr[] = {2, 4, 6, 8, 11, 16, 13, 11, 9, 3, 1};

        int index = findPeakElementInBitonicArray(arr);

        if(index == -1)
        {
            System.out.println("Element Does Not Exist");
        }
        else
        {
            System.out.println("Found " + arr[index] + " at : " + index);
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
}