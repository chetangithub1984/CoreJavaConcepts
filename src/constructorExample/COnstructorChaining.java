package constructorExample;

public class COnstructorChaining {
	
	
	public  COnstructorChaining()
	{
		this(10);//constructor calling
	}
	public COnstructorChaining(int i)
	{
		this("Java");
		System.out.println(i);
		
	}
	
	public COnstructorChaining(String s)
	{
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		COnstructorChaining obj = new COnstructorChaining(); 
	}

}
