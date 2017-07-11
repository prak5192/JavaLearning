package dataStructure.java;

public class SecondLargestNumber {

	public static void main(String []args){
		int array[] = {1,2,4,1,5,1,6,8,2,9,10,45,33};
		
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int n : array)
		{
			if(n>max1)
			{
				max2 = max1;
				max1 = n;
			}else if(n > max2)
			{
				max2 = n;
			}
		}
		
		System.out.println("2nd largest number: " + max2 );
	}
}
