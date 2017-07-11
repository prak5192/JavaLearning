package dataStructure.java;

//http://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/



/*
 * 
 * Method 1 (Use Bubble k times)
Thanks to Shailendra for suggesting this approach.
1) Modify Bubble Sort to run the outer loop at most k times.
2) Print the last k elements of the array obtained in step 1.

Time Complexity: O(nk)

Like Bubble sort, other sorting algorithms like Selection Sort can also be modified to get the k largest elements.
 * 
 */
public class kLargestElement {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 1, 6, 8, 9, 10, 45, 33 };
		//int n = arr.length;
		int temp;
		int n = 6;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] < arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i =0; i< 6 ; i++)
		{
			System.out.println(arr[i]);
		}
		

	}
}
