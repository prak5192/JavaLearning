package dataStructure.java;

public class LargestArray {

	public static void main(String[] args) {

		int arr[] = { 1, 120, 56, -1, 87 };
		int largest = arr[0];
		int smallest = arr[0];
		int small = 0;
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
				index = i;
			} else if (smallest > arr[i]) {
				smallest = arr[i];
				small = i;
			}
		}
		System.out.println("Largest Number :" + largest + ", having index :" + index);
		System.out.println("Smallest Number :" + smallest + ", having index :" + small);
	}
}
