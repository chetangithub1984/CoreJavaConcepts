package typeOfVariable;

public class Home {
	
	int a;//instance variable
	double d;
	String s;
	char c;
	
	boolean b;
	
	public static void main(String[] args) {
		
		Home obj= new Home();
		System.out.println(obj.a==100);//
		System.out.println(obj.d);//0.0
		System.out.println(obj.s);//null
		System.out.println(obj.c);// single space
		System.out.println(obj.b);
		obj.add();
		
	}

	public void add()
	{
		Home obj= new Home();
		System.out.println(obj.a);//
	}
}
