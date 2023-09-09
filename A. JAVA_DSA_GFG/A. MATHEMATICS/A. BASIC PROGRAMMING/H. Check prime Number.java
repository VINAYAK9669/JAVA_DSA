// Program to find out the prime Number

/*
Below thing we must analyse while solvinh this problem

1) If any number divides by 2 and 3 are not prime number ( base conditions)
2) If we are taking base condition 2 and 3 we do not need to check for those number
   which are divisible by 2 and 3 both.
   
   for example:
   
   1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 , 14, 15, 16, 17, 18, 19, 20, 21....
   
   we dont need to check for : 4 6 8 9 10 12 14 15 16.....because these numbers
   are either divisible by 2 or 3.
   
   NOW THE CHALLENGE :
   
   Now the the challenge is to create a logic which will iterate only through the numbers
   which are not divisible by 2 or 3.
   
   let us see the number which are not divisible by 2 and 3.
   
   5, 7, 11, 13, 17, 19, 23, 29, 31, 37....  Now check the adjecent difference
     |  |   |   |   |   |   |   |   |
    2   4   2   4   2   4   6   2   6 
    
    So from this we can understand that the minimum difference is 2 and at every 6th position the number is occuring which we want

*/


import java.util.*;

public class Main
{
    // Function that will return the GCD(a,b)
    
     static boolean checkPrime(int number)
    {
        if(number==1) return false;
        if(number==2 || number==3) return true;
        
        if(number%2==0 || number%3==0)
        {
            return false;
        }
        for(int i=5; i*i<=number; i=i+6)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    
	    int number= sc.nextInt();
	    
	    System.out.print(checkPrime(number));
	
	}
}
