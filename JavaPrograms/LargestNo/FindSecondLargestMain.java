package LargestNo;

/*Algorithm:

 Initialize highest and secondHighest with minimum possible value.
 Iterate over array.
 If current element is greater than highest
 Assign secondHighest = highest
 Assign highest = currentElement
 Else if current element is greater than secondHighest
 Assign secondHighest =current element.*/

public class FindSecondLargestMain {

	public static void main(String[] args) {
		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		int secondHighest = findSecondLargestNumberInTheArray(arr1);
		System.out.println("Second largest element in the array : "
				+ secondHighest);
	}

	private static int findSecondLargestNumberInTheArray(int[] arr1) {
		// Initialize these to the smallest value possible
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		// Loop over the array
		for (int i = 0; i < arr1.length; i++) {
			// If current element is greater than highest
			if (arr1[i] > highest) {
				// assign second highest element to highest element
				secondHighest = highest;
				// highest element to current element
				highest = arr1[i];

			}// Just replace the second highest
			else if (arr1[i] > secondHighest) {
				secondHighest = arr1[i];
			}
		}
		// After exiting the loop, secondHighest now represents the second
		// largest value in the array
		return secondHighest;
	}
}
