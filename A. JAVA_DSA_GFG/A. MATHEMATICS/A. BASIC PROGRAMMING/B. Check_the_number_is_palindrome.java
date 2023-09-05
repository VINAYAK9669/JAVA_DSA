//  Check wheather given positive number is palindrome or not
import java.util.*;
public class Main
{
    static boolean isPalindrome(int number)
    {
       
        int traceNumber=0;
        int temp=number;
       while(number>0)
       {
           
           int palidromeNumber= number%10; // simply store the last digit
               number= number/10;// new number with removing last digit
               traceNumber= (traceNumber*10)+palidromeNumber;//will increase the position of the digits
               
       }
       return traceNumber==temp;
        
    }
	public static void main(String[] args) {
	    
	//Take a input from the user 
		
		  //  For this we first need to create Scanner Object
		    Scanner sc= new Scanner(System.in);
		  //  Now will create a varible which will hold the user input value
		  int userInputValue= sc.nextInt();
		  
	 // call a function which check the number is palindrome or not.
	      System.out.println(isPalindrome(userInputValue));
	     sc.close();
	
		
	}
}
