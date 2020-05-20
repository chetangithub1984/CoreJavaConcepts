package operatorsExMple;

public class UnaryOperators {

	public static void main(String[] args) {

		// ++ --> increment Operator
		// It increases the value of the operand by 1
		// pre-increment(++operand)--> first I will increase the value and the
		// next operation(s) will be performed
		// post-increment(operand++)--> First rest of the operation(s) will be
		// done and then I will increase the value

		//int i = 10;
		
		/*i=++i;// assignment, increment
		System.out.println(i);*/
		
		for(int j=1;j<=10;++j)
		{
			System.out.println(j);
		}
		
		
		
		/*System.out.println(++i);//increment-11   print-11
		System.out.println(++i);//incre-12  print-12
		System.out.println(i++);//print-12  increment-13
		System.out.println(i);//print-13
		System.out.println(i++);//print-13 increm-14
		System.out.println(i);//print-14
		
		System.out.println(--i);//decrement-13 print-13
		System.out.println(i--);//print-13 decre->12
		System.out.println(++i);//increment-13 print-13
		System.out.println(--i);//decrem-12 print-12
		System.out.println(i);//12
*/		
		// ++i--> i=i+1
		
		
		// ! --> it wil convert true into false and vice-versa
		//System.out.println(!true);
		
		boolean b1=true;
		System.out.println(!b1);
		

	}
}
