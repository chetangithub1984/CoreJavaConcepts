package SelectionStatements;

public class BreakAndContinue {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) // i=1; 1<=10
		{
			/*if (i <= 5) //6<=5
			{
				System.out.println(i);//5
			}
			else
			{
				break;
			}*/
			
			if(i==5)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
			
		}
		

	}

}
