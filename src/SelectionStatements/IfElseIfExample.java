package SelectionStatements;

public class IfElseIfExample {

	public static void main(String[] args) {
		/*
		 * value:- small,medium,large value between 1 t0 10 small value is
		 * between 11 to 15 medium value is more than 15 large
		 */

		int size = 11;
		if (size <= 10) {
			System.out.println("size is small");

		}
		else if (size > 10 && size <= 15) {
			System.out.println("size is medium");
		}
		else if (size > 15) {
			System.out.println("size is large");
		}
	}

}
