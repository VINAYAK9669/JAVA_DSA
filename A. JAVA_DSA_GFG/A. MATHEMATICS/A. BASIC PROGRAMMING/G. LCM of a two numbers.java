// Program to find the LCM of a two Number where numbers >0
/*
in this we use the formula of the LCM

LCM(a,b) =(a*b)/ GCD(a,b)

Here we will find out the GCD using Eucledian algorithm
*/
import java.util.*;

public class Main
{
    // Function that will return the GCD(a,b)
    
     static int GCD(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        
       return GCD(b, a%b);
        
    }
    static int LCM(int a, int b)
    {
        int lcm= (a*b)/GCD(a, b);
        return lcm;
    }
    
	public static void main(String[] args) {
	    int a=15, b=20;
	   // int a=2, b=8;
	  
	    System.out.print(LCM(a,b));
	
	}
}
