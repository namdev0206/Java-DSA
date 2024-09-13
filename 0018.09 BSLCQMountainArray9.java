//https://leetcode.com/problems/peak-index-in-a-mountain-array/


public class BSLCQMountainArray9
{
    public static void main(String[] args)
    {
        int arr[] = {0, 2, 3, 5, 7, 9, 11, 18, 200, 100, 90, 85, 70, 50, 30, 25, 15, 10, 5, 1, 0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("The Peak Index in the Mountain Array is : " + ans);
    }

    public static int peakIndexInMountainArray(int arr[])
    {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1])
            {
                //You are in Decreasing part of the Array
                //Maybe the ans, but look at left
                //This is why end != mid - 1
                end = mid;
            }
            else
            {
                //You are in Ascending part of the Array
                start = mid + 1;  //Because we know that mid + 1 element > mid element
            }
        }

        //In the End, Start == End and pointing to the Largest Number Because of the 2 Checks above
        //Start and End are always trying to find Max element int the above 2 Checks
        //Hence, when they are pointing to just one Element, that is the Max one Because that is what the Checks Say
        //More Elaboration : At every point of Start and End, they havethe best possible ans till that time
        //And if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans

        return start; //or return end because Both are Equal
    }
}
