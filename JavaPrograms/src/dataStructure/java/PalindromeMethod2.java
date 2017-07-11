package dataStructure.java;

public class PalindromeMethod2 {
	public static void main(String args[]) {
		String inputString = "12321";
		int length = inputString.length();
	
		int flag = 0;
		
		for (int begin = 0, end = length -1 ; begin <= length/2; begin++, end--) {
			if (inputString.charAt(begin) == inputString.charAt(end)) {
				continue;
			} else {
				flag = 1;
				System.out.println("Not a palindrome");
				break;
			}
		}
		if(flag == 0){
			System.out.println("Palindrome");
		}
	}
}
