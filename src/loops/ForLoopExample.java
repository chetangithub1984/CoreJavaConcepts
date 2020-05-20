package loops;

public class ForLoopExample {
	
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		
		if(a>b )
		{
			if(a>c)
			{
				System.out.println("a is the largest value");
			}
			else
			{
				System.out.println("c is the largest value");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is the largest");
			}
			else
			{
				System.out.println("c is the largest");
			}
		}
		
		
		/*
		 * for(int i=1;;i++)// i=1 { System.out.println(i); }
		 */
	}

}
