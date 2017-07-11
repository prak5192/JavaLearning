package dataStructure.java;

public class ArmstrongNumber {
	public static void main(String args[]) {

		int n = 371;
		int sum = 0;
		int temp;
		int r;
		temp = n;
		while (temp != 0) {
			r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;
		}
		if (n == sum){
			System.out.println(n + " is an Armstrong number.");
		}else{
			System.out.println(n + " is not an Armstrong number.");
		}
	}
}
