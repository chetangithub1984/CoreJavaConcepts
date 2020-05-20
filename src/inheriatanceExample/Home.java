package inheriatanceExample;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("ENter the first value");
	    int var=10;
		System.out.println("Enter sendond value");
		String var2="";
		// password
		Home h= new Home();
		h.print(var, var2);
	}

	public void print(String email, String password)

	{
		System.out.println(email);
		System.out.println(password);
	}

	public void print(int mobile, String password)

	{
		System.out.println(mobile);
		System.out.println(password);
	}

}
