public class LinearSearchSearchInRange
{
    public static void main(String[] args)
    {
        int arr[] = {18, 12, -7, 3, 14, 28};

        int target = 3;

        System.out.println(rangeSearch(arr, target, 1, 4));
    }

    public static int rangeSearch(int arr[], int target, int start, int end)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        //Run a for loop
        for(int index = start; index <= end; index++)
        {
            //Check for every element at every index if it is = target
            int element = arr[index];
            if(element == target)
            {
                return index;
            }
        }

        //This line will be executed if none of the return statement will work
        //Hence the Target not found
        return -1;
    }
}
