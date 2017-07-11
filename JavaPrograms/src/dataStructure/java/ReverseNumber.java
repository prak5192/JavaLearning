package dataStructure.java;

public class ReverseNumber {
	public static void main(String[] args) {
		int rev = 0;
		int num = 1234;
		while (num > 0) {
			int rem = num % 10;
			rev = rem + (rev * 10);
			num = num / 10;
		}
	}
}
