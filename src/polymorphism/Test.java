package polymorphism;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Test t= new Test();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 2 or 3 values seperated by ',' ");
		String value=scan.nextLine();
		System.out.println(value);
		int[] array={1,2};
		for(int i=0;i<array.length;i++)
		{
			//int j=array[]
		}
		t.add(value);
		
	
	}
	
	
	
	public void add(int a, int b)
	{
		int sum= a+b;
		System.out.println("sum--> "+sum);
	}
	
	public void add(int a, int b, int c)
	{
		int sum= a+b+c;
		System.out.println("sum--> "+sum);
	}
	
	
	
}
