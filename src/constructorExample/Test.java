package constructorExample;

public class Test {

	
	public static void main(String[] args) {
		Test t= new Test();
		t.p1();
		//this.p1();
	}
	
	public void p1()
	{
		/*Test obj = new Test();
		obj.p2();*/
		this.p2();
		
	}
	
	public void p2()
	{
		
	}
	
	public static void p3()
	{
		
	}
}
