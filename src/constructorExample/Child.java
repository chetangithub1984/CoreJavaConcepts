package constructorExample;

public class Child extends Parent {

	int i = 50;

	public Child() {
		
		System.out.println("Child class no-arg constructor");
	}

	public static void main(String[] args) {
		Child c = new Child();

		// Parent p= new Parent();
		// c.add();

	}

	public void add() {
		System.out.println("add() of Child class");
		// add() of parent class here

		super.add();
		// print value of child class variable i here
		System.out.println(this.i);
		// print the value f variable i of the parent class
		System.out.println(super.i);

	}

}
