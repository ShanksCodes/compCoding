
public class longestPrefix {
    
   public static int minLength(String[] str)
    {
       int minLength = str[0].length();
       for(int i = 1; i<str.length; ++i)
        {
           if(str[i].length()<minLength)
            {
                minLength = str[i].length();
            }
        }

        return minLength;
    }

    public static String longestCommonPrefix(String[] str)
     {
        StringBuilder longestPrefix = new StringBuilder("");
        int minLength = minLength(str);
        for(int i=0; i<minLength; ++i)
         {
            for(int j=1; j<str.length; ++j)
             {
                if(str[0].charAt(i)!=str[j].charAt(i))
                 {
                    return longestPrefix.toString();
                 }
               
             }

             longestPrefix.append(str[0].charAt(i));

         }

         return longestPrefix.toString();
     }

     public static void main(String[] args)
      {
        String[] str = {"HolaA", "HolaB", "HolaaC", "HolaHolaD"};
        System.out.println("\nLongest common prefix is: " + longestCommonPrefix(str));
      }

}
