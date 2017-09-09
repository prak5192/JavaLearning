package pwd.question;

public class PairSum {
	
	
	public static void main(String [] args){
		int [] array = {1,2,3,4,2,4,2,3,5,2,5,23,6,32};
		int target = 10;
		for(int i=0; i< array.length; i++){
			for(int j = 0; j< array.length; j++){
				if(array[i] + array[j]  == target){
					
					System.out.println("array[" + i + "] + array[" + j + "] is equal to target " + target );
				}
			}
		}
		
	}

}
