package constructorExample;

public class Parent {
	
	
	
	public Parent()//no-arg
	{
		System.out.println("Parent class no-arg cons");
	}
	
	public Parent(int i)
	{
		System.out.println("Parent class one-arg constructor");
		
	}
	
	
	int i=100;
	
	public void add()
	{
		System.out.println("add() of Parent class");
	}

}
