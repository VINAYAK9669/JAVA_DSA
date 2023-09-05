// PROBLEM STATMENT: We are given an n-digit number. The task is to find the number of digits in the number, provided that, n>0.
import java.util.*;
public class Main
{
    static void findDigits(int number)
    {
        int count=0;
        
        while(number>0)
        {
            count++;
            number=number/10;
            
        }
        System.out.println(count);
        
    }
	public static void main(String[] args) {
		//Take a input from the user 
		
		  //  For this we first need to create Scanner Object
		    Scanner sc= new Scanner(System.in);
		  //  Now will create a varible which will hold the user input value
		  int userInputValue= sc.nextInt();
		  //Now I will pass the userInputValue as argument to the function 
		  //which will calculate the number of digits from the number
		  
		  findDigits(userInputValue); // as this is a static method hence need not to create an object
		
	}
}

