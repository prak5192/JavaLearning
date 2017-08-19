package JavaGeneral;

public class ExceptionDemo {

	public void method1()  throws Exception{
		System.out.println("Prakash");
		System.out.println("Prakash");
		System.out.println("Prakash");
		System.out.println("Prakash");
		System.out.println("Prakash");
		
		int i = 10/0;
		
		System.out.println("Archana");
		System.out.println("Prakash");
		System.out.println("Prakash");
		System.out.println("Prakash");
		
		
	}
	
	public static void main(String[] args) throws customException{
		ExceptionDemo obj1 = new ExceptionDemo();
		try {
			obj1.method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new customException();
		}
		System.out.println("main");
	}
}
