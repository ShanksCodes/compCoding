
import java.util.Scanner;
import java.util.Arrays;
// Class of ReverseString
public class reverseAString {

    public static String reverseTheString(String str)
     {
        char[] reverseInput = str.toCharArray();
        char temp;
        
        for(int i=0,j= str.length()-1 ; i<j; ++i, --j)
            {  
              temp = reverseInput[i];      
              reverseInput[i] = reverseInput[j];
              reverseInput[j] = temp;
            }

           return new String(reverseInput); 
         
     }
	public static void main(String[] args)
	 {
	   Scanner sc = new Scanner(System.in);
       System.out.print("\nEnter string to reverse: ");
       String myString = sc.nextLine();
       String outputString = reverseTheString(myString);

       System.out.println("Original Array: " + myString);
       System.out.println("Reverse Array: " + outputString);
     }


 }


