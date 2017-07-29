package learning;

import java.util.SortedMap;

public class Sorting {
	public static void main(String []args){
		int [] a = {33,65,43,32,33};
		
		int size = a.length;
		
		for(int i = 0; i < size; i++){
			for(int j = i+1 ; j < size;j++){
				if(a[j] < a[i]){
					int temp = a[j];
					a[j] = a[i];;
					a[i] = temp;
				} 
			}
			for(int k =0; k< size; k++){
				System.out.println(a[k]);
			}
			System.out.println();
		}
		
		for(int k =0; k< size; k++){
			System.out.println(a[k]);
		}
	}
}

