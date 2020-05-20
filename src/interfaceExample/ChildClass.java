package interfaceExample;

public class ChildClass implements Parent1,Parent2{
	
	public void p1()
	{
		System.out.println("P1() of childclass");
	}
	
	public static void main(String[] args) {
		ChildClass c= new ChildClass();
		c.p1();
	}

}
