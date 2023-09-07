import java.util.*;
public class Main
{
    static void  GCD( int input1, int input2)
    {
      int minNumber= Math.min(input1, input2);
      int maxNumber=Math.max(input1, input2);
    //   System.out.println(minNumber);
    if(maxNumber%minNumber==0)
    {
        System.out.println(minNumber);
        return;
    }else{
        for(int i=minNumber; i>=1;i--)
        {
            if(maxNumber%i==0 && minNumber%i==0)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(1);
        
    }
        
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
