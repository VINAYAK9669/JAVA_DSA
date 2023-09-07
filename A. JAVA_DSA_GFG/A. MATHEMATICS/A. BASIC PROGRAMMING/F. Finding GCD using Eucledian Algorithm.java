import java.util.*;
public class Main
{
    static void  GCD( int a, int b)
    {
    //    Now we use eucledian algorithm to solve for GCD 
    //  As per eucledian the GCD will not change when we subract the max Numb from minumum number
    
    while(a!=b)
    {
        if(a >b)
        {
            a-=b;
            
        }
        else{
            b-=a;
        }
        
    }
    System.out.println(b);
  
    }
   
    
	public static void main(String[] args) {
	    
	//Take a input from the user 
		
		  //  For this we first need to create Scanner Object
		    Scanner sc= new Scanner(System.in);
		  //  Now will create a varible which will hold the user input value
		   int input1= sc.nextInt();
		   int input2=sc.nextInt();
		  
   // Call a function which will find the GCD of a two numbers
          GCD(input1,input2);

	}
}
