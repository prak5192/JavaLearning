package dataStructure.java;

public class ReverseString {
	public static void main(String args[])
	{
	      String original="My Name Is Archana Singh";
	      String reverse = "";
	      
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- ){
	         reverse = reverse + original.charAt(i);
	      }
	 
	      System.out.println("Reverse of String is: "+reverse);
	}
}
