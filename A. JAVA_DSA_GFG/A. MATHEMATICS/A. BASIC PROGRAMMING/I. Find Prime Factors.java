// Program to find out the prime Factor of a number

/*




*/


import java.util.*;

public class Main
{
    // Function that will return the GCD(a,b)
    
     static void printPrime(int number)
    {
        if(number<=1) return;
        while(number%2 ==0){
            System.out.print(2+" ");
            number=number/2;
        }
        while(number%3 ==0)
        {
            System.out.print(3+" ");
            number=number/3;
        }
        
        for(int i=5; i*i <=number; i=i+6)
        {
            while(number%i ==0)
            {
                System.out.print(i+" ");
                number=number/i;
            }
            while(number%(i+2)==0)
            {
                 System.out.print((i+2) +" ");
                 number=number/(i+2);
            }
        }
        if(number>3)
        {
            System.out.print(number);
        }
       
    }
    
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
	    
	    int number= sc.nextInt();
	    
	   printPrime(number);
	
	}
}
