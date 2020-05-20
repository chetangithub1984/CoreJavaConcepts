package exceptionHandling;

public class Home {
	
	public static void main(String[] args) throws MyException {
		
		
		System.out.println(1);
		System.out.println(2);
		MyException.show(10);
		System.out.println(3);
		System.out.println(4);
	}

}
