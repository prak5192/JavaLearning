package RemoveDup;

import java.util.Arrays;

public class RemoveDupArray {

	public static void main(String[] args) {
		int[] input = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
		int[] result = RemoveDupArray.removeDuplicate(input);
		/*for (int k = 0; k < result.length; k++) {
			System.out.println(Arrays.toString(result));
		}*/
		System.out.println(Arrays.toString(result));

	}

	public static int[] removeDuplicate(int[] arr) {
		boolean[] set = new boolean[1001];
		int total_item = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!set[arr[i]]) {
				set[arr[i]] = true;
				total_item++;
			}
		}

		int[] ret = new int[total_item];
		int c = 0;
		for (int i = 0; i < set.length; i++) {
			if (set[i]) {
				ret[c++] = i;

			}
		}
		return ret;

	}

}
