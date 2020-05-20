package conditionalOperators;

public class TernaryOperator {

	public static void main(String[] args) {

		// (condition)?<executed if condition is true>:executed if cond is false

		// System.out.println(false?"This is a true condition":"This is a false
		// condition");

		int a = 100;
		int b = 20;
		int c=30;

		System.out.println(a>b?(a>c?"a is the largest":"c is the largest"):
			(b>c?"b is the largest":"c is the largest"));

	}

}
