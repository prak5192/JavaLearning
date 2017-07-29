package pwd.question;

public class Question2 {

	public static void main(String [] args){
		try{
			System.out.println(callDivide(1,0));
		}catch(Exception e){
			System.out.println("Throwing exception e");
		}
	}
	
	private static int callDivide(int i, int j) throws Exception{
		int retval = 0;
		try{
			retval = i/j;
		}catch(Exception e){
			System.out.println("Step1");
			throw e;
		}finally {
			retval = 9;
			System.out.println("Prakash");
		}
		
		return retval;
	}
	
}
