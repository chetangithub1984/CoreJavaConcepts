package methods;//package statement

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {

		Sample obj = new Sample();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first String");
		String s1 = scan.nextLine();

		System.out.println("Please enter second String");
		String s2 = scan.nextLine();

		String resultString = obj.concateTwoString(s1, s2);
		System.out.println(resultString);

	}

	public String concateTwoString(String str1, String str2) {
		String finalString = str1 + " " + str2;

		return finalString;
	}

}
