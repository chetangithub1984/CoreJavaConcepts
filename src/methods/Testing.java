package methods;

public class Testing {
	
	public static void main(String[] args) {
		
		//create a method--> return the object of the Testing class
		
		Testing obj=returnObject();
		obj.add();
		
	}

	
	public  static  Testing returnObject()
	{
		
		Testing t= new Testing();
		System.out.println(t);
		return t;
	}
	
	public void add()
	{
		int sum=10+20;
		System.out.println("Sum-->"+sum);
	}
	
}
