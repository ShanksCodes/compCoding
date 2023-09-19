import java.util.Scanner;
import java.util.Stack;

public class reverseByWords {
  
    public static String reverseTheWords(String str)
     {
        Stack <Character> s = new Stack<>();
        StringBuilder reversedString = new StringBuilder();

        for(int i=0; i<str.length(); ++i)
         {
            if(str.charAt(i) == ' ')
             {
                while(s.isEmpty()==false)
                 {
                   reversedString.append(s.pop());
                 } 

                 reversedString.append(" ");
             }
            
             else
              {
                s.push(str.charAt(i)); 
              }
         }

          while(s.isEmpty()==false)
           {
                   reversedString.append(s.pop());
           } 

        return reversedString.toString();
     }

     
 

     public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter string to reverse by words: ");
        String myString = sc.nextLine();
        String outputString = reverseTheWords(myString);
 
        System.out.println("Original Array: " + myString);
        System.out.println("Reverse Array: " + outputString);
      }

}
