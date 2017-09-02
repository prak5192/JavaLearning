
class RemoveDuplicateInArray{
//Throws an exception if values are not in the range of 0-1000
public static int[] removeDuplicates(int[] arr) {
    boolean[] set = new boolean[1001]; //values must default to false
    int totalItems = 0;

    for (int i = 0; i < arr.length; ++i) {
        if (!set[arr[i]]) {
            set[arr[i]] = true;
            totalItems++;
        }
    }

    int[] ret = new int[totalItems];
    int c = 0;
    for (int i = 0; i < set.length; ++i) {
        if (set[i]) {
            ret[c++] = i;
        }
    }
    return ret;
}

public static void main(String [] args){


}
