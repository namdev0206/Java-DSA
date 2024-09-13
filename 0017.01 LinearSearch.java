public class LinearSearch
{
    public static void main(String[] args)
    {
        //int arr[] = {2, 2, 3, 4, 1, 7, 2, 9};

        //linearSearch(arr, 1);

        //linearSearch2(arr, 2, false);
        //linearSearch2(arr, 2, true);

        //linearSearchMultiple(arr, 2);

        //findMax(arr);

        //findMin(arr);

        int arr2d[][] = {
                {2, 4, 1, 5, 1},
                {6, 7, 3, 4, 2},
                {8, 1, 2, 2, 3},
                {5, 5, 5, 8, 4}
        };

        //linearSearch2d(arr2d, 4, false);

        findMaxSumSubarray(arr2d);
    }

    //Find maximum in the SubArray
    public static void findMaxSumSubarray(int arr[][])
    {
        int max = Integer.MIN_VALUE;
        int resIndex = -1;

        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++)
            {
                sum = sum + arr[i][j];
            }

            if(sum > max)
            {
                max = sum;
                resIndex = i;
            }
        }

        System.out.println("Maximum sum Subarray is : " + max + ", for the index " + resIndex);
    }


    //Find the Element in Linear Search
    public static void linearSearch(int arr[],int target)
    {
        int ans = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                ans = i;
                break;
            }
        }
        if(ans == -1)
        {
            System.out.println("Element is not preset int the Array");
        }
        else {
            System.out.println("Found Element at " + ans + " position");
        }
    }


    //Find the Element in the Linear Search
    public static void linearSearch2(int arr[],int target, boolean findLast)
    {
        int ans = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                ans = i;

                if(findLast == false)
                {
                    break;
                }

            }
        }
        if(ans == -1)
        {
            System.out.println("Element is not preset int the Array");
        }
        else {
            System.out.println("Found Element at " + ans + " position");
        }
    }


    //Find Multiple Occurance of an Element in an Array
    public static void linearSearchMultiple(int arr[],int target)
    {
        int ans[] = new int[arr.length];
        int k = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target)
            {
                ans[k] = i;
                k++;
            }
        }
        if(k == 0)
        {
            System.out.println("Element is not preset int the Array");
        }
        else
        {
            for(int i = 0; i < k; i++)
            {
                System.out.println("Found Element at " + ans[i] + " position");
            }
        }
    }


    //Find the Maximum in an Array
    public static void findMax(int arr[])
    {
        int max = arr[0];

        //int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        System.out.println("Maximum element in the array is : " + max);
    }


    //Find the Minimum in an Array
    public static void findMin(int arr[])
    {
        int min = arr[0];

        //int min = Integer.MAN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("Minimum element in the array is : " + min);
    }


    //Find the Element in 2d Array
    public static void linearSearch2d(int arr[][], int target, boolean findLast)
    {
        int outerIndex = -1;
        int innerIndex = -1;

        for(int i = 0; i < arr.length; i++)
        {
            boolean found = false;

            for(int j = 0; j < arr[i].length; j++)
            {
                if(target == arr[i][j])
                {
                    outerIndex = i;
                    innerIndex = j;

                    if(findLast == false)
                    {
                        found = true;
                        break;
                    }
                }
            }

            if(found == true)
            {
                break;
            }
        }

        if(outerIndex == -1)
        {
            System.out.println("Element is not present in the Array");
        }
        else
        {
            System.out.println("Found element at " + outerIndex + ", " + innerIndex);
        }

    }
}