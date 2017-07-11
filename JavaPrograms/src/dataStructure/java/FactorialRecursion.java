package dataStructure.java;

public class FactorialRecursion {
	 public static void main(String[] args) {
		 int inputNumber = 5; // Suppose finding the factorial of 4.
		 int factorial = findfactorial(inputNumber);
	     System.out.println(factorial);
	 }

	 private static int findfactorial(int n) {
	      if (n <= 1)
	            return 1;
	      else
	            return n * findfactorial(n - 1);
	}
}
