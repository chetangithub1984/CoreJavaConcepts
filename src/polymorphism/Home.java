package polymorphism;

public class Home {
	public static void main(String[] args) {

		Home h= new Home();
		h.add(10, 20,30);
	}

	/*10
	 * The parameter list must be different and the method must be same 1. by
	 * having diff numbers of paramters 2. By having different data type of the
	 * parameters 3. By changing the sequence of the parameters
	 * 
	 */
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);

	}

	public int add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
		return sum;

	}

	public void add(int var1, double var2) {
		double sum = var1 + var2;
		System.out.println(sum);

	}

	public void add(double a, int b)
	{
		double sum= a+b;
		System.out.println(sum);
	}
}
