package conditionalOperators;

public class Test {
	
	public static void main(String[] args) {
		/*int i=10;
		int j=20;
		
		System.out.println((i<j) || (j==i));//
*/		
		String s1="Rahul";// new object will created
		String s2;
		//System.out.println("s2 value before assignment-->"+s2);
		s2=s1;
		String s3= new String("Rahul");//
		System.out.println((s1==s2) && (s1==s3));
		System.out.println((s1.equals(s2)) && (s1.equals(s3)));
	}

}
