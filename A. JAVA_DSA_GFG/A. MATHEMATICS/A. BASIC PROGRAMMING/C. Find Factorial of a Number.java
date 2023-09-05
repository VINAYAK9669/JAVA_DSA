import java.util.*;
public class Main
{
    static void  factOfNumber(int number)
    {
       int factorial=1;
       
      for(int i=number; i>1;i--)
      {
          factorial=factorial*i;
      }
      System.out.println(factorial);
        
    }
	public static void main(String[] args) {
	    
	//Take a input from the user 
		
		  //  For this we first need to create Scanner Object
		    Scanner sc= new Scanner(System.in);
		  //  Now will create a varible which will hold the user input value
		  int userInputValue= sc.nextInt();
		  
   // Call a function which will calculate the factorial of a number
          factOfNumber(userInputValue);

	}
}
