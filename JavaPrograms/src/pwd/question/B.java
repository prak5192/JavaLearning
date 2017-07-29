package pwd.question;


class B extends Question4{
	void B(){
		System.out.println("Inside b1");
	}
	
	public  B(){
		super();
		System.out.println("Inside b2");
	}
	
	public B(int b){
		super(b);
		System.out.println("Inside b3");
	}

	public static void main(String [] args){
		B b1 =new B();
		Question4 b = new B(1);
	}
}

class Question4 {

	void Question4(){
		System.out.println("Inside a1");
	}
	
	public Question4(){
		super();
		System.out.println("Inside a2");
	}
	
	public Question4(int a){
		super();
		System.out.println("Inside a3");
	}
}