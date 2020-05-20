package typeOfVariable;

public class LocalVariable {

	int a = 100;// instance variable
	static int b = 200;// static variable

	public static void main(String[] args) {
		
		int  var=100;//local
		int xyz=0;
		if(var==100)
		{
			 xyz=500;//local variable
		}
		
		System.out.println(xyz);//
	}

	public void add() {
		int var = 100;
	}

}
