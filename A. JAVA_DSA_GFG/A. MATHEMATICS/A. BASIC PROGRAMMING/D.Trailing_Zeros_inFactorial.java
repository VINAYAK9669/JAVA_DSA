import java.util.*;
public class Main
{
    static void  trailingZeros( int number)
    {
      int result=0;
      
      for(int i=5; i<=number;i=i*5)
      {
          result= result + (number/i);
      }
      System.out.println("Number of trailing Zeros are="+result);
        
    }
	public static void main(String[] args) {
	    
	//Take a input from the user 
		
		  //  For this we first need to create Scanner Object
		    Scanner sc= new Scanner(System.in);
		  //  Now will create a varible which will hold the user input value
		   int userInputValue= sc.nextInt();
		  
   // Call a function which will calculate trailing zeros of the factorial of a number
          trailingZeros(userInputValue);

	}
}
