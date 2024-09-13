public class LinearSearch2
{
    public static void main(String args[])
    {
        int nums[] = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};

        int target = 19;
        int ans = linearSearch(nums,  target);
        System.out.println(ans);
    }



    //Search the target and return true or false
    public static boolean linearSearch3(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return false;
        }

        //Run a for Loop
        for(int index = 0; index < arr.length; index++)
        {
            //Check for element at every index if it is = target
            int element = arr[index];

            if(element == target)
            {
                return true;
            }
        }

        //THis line will execute if none of the return statements above have executed
        //Hence the target not found
        return false;
    }



    //Search the target and return the element
    public static int linearSearch2(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        //Run a for Loop
        for(int index = 0; index < arr.length; index++)
        {
            //Check for element at every index if it is = target
            int element = arr[index];

            if(element == target)
            {
                return element;
            }
        }

        //THis line will execute if none of the return statements above have executed
        //Hence the target not found
        return Integer.MAX_VALUE;
    }




    //Search in the Array : Return the index if item found
    //Otherwise if item not found return -1
    public static int linearSearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }

        //Run a for Loop
        for(int index = 0; index < arr.length; index++)
        {
            //Check for element at every index if it is = target
            int element = arr[index];

            if(element == target)
            {
                return index;
            }
        }

        //THis line will execute if none of the return statements above have executed
        //Hence the target not found
        return -1;
    }
}
