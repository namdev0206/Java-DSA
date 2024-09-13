import java.util.*;

public class LinearSearchInStrings
{
    public static void main(String args[])
    {
        String name = "Kunal";
        char target = 'u';

        //For Loop
        //System.out.println(search(name, target));

        //For Each Loop
        System.out.println(Arrays.toString(name.toCharArray()));
    }


    //Search the Character in an String using For Each Loop
    public static boolean search2(String str, char target)
    {
        if(str.length() == 0)
        {
            return false;
        }

       for(char ch : str.toCharArray())
       {
           if(ch == target)
           {
               return true;
           }
       }

        return false;
    }



    //Search the Character in an String using For Loop
    public static boolean search(String str, char target)
    {
        if(str.length() == 0)
        {
              return false;
        }

        for (int i = 0; i < str.length(); i++)
        {
            if(target == str.charAt(i))
            {
                return true;
            }
        }

        return false;
    }
}
