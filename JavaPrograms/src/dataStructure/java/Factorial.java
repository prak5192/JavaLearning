package dataStructure.java;

public class Factorial {
	public static void main(String args[])
	{
	      int  n = 0; // Input Number
	      int c, fact = 1;
	 
	      if ( n < 0 ){
	         System.out.println("Number should be non-negative.");
	      }else{
	         for ( c = 1 ; c <= n ; c++ ){
	            fact = fact*c;
	         }
	         System.out.println("Factorial of " + n + " is = " + fact);
	      }
	}
}
