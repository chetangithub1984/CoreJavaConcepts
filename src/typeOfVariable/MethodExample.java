package typeOfVariable;

public class MethodExample {
	
	
	int a= 100;
	static int b=200;
	public static void main(String[] args) {
		
		
		
		System.out.println(MethodExample.b);
		MethodExample obj= new MethodExample();
		System.out.println(new MethodExample().a);
		
	}
	
	public void add()
	{
		MethodExample.substract();
		new MethodExample().multiply();
		
		
	}
	
	public static void substract()
	{
		
	}

	public void multiply()
	{
		
	}
}
