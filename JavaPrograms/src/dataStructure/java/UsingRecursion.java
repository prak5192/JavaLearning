package dataStructure.java;

public class UsingRecursion {
	int sum;
	public int CalRecSum(int n) {
		if (n == 0) {
			return sum;
		} else {
			sum += n % 10;
			CalRecSum(n / 10);
		}
		return sum;
	}

	public static void main(String[] args) {
		int number = 12345;
		UsingRecursion ob = new UsingRecursion();
		System.out.println("Sum of Digits =" + ob.CalRecSum(number));

	}
}
