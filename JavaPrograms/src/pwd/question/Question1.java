package pwd.question;

//http://www.sanfoundry.com/java-mcqs-arrays-revisited-static/
//http://www.sanfoundry.com/java-questions-answers-freshers-experienced/
	
class access{
    public int x;
	static int y;
    void cal(int a, int b){
        x +=  a ;
        y +=  b;
    }        
}    

class Question1 {
    public static void main(String args[])
    {
        access obj1 = new access();
        access obj2 = new access();   
        obj1.x = 0;
        obj1.y = 0;
        obj1.cal(1, 2);
        obj2.x = 0;
        obj2.cal(2, 3);
        System.out.println(obj1.x + " " + obj2.y);     
    }
}
