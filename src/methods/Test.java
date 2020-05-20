package methods;

import java.util.Scanner;

public class Test {

	int i = 10;

	public static void main(String[] args) {

		Test obj = new Test();

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first integer value and then press Enter key");

		int a = scan.nextInt();
		System.out.println("Please enter second integer value and press the Enter key");
		int b = scan.nextInt();

		int abc = obj.addTwoValues(a, b);// 10,20
		System.out.println(abc);

		obj.printAdditionResult(abc);//method calling
		scan.close();

	}

	public int addTwoValues(int var1, int var2) {

		int sum = var1 + var2;
		
		return sum;

	}

	public void printAdditionResult(int xyz)//method declaration
	{
		System.out.println(xyz);

	}

}
