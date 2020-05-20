package typeOfVariable;

public class Test {
	
	int a=10;//instance variable
	int b=10;//instance variable
	
	public static void main(String[] args) {
		
		Test t1=new Test();
		Test t2= new Test();
		
		System.out.println(t1.a);//
		System.out.println(t2.a);
		
		t2.a=20;
		System.out.println(t1.a);//10
		System.out.println(t2.a);//20
		
		
		
	}
	
	

}
