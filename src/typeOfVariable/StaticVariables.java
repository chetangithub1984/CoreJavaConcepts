package typeOfVariable;

public class StaticVariables {
	static int a=10;
	
	public static void main(String[] args) {
		
		StaticVariables obj1= new StaticVariables();
		System.out.println(obj1.a);//
		
		StaticVariables obj2= new StaticVariables();
		obj2.a=500;
		System.out.println(obj1.a);//500
		
	}

}
