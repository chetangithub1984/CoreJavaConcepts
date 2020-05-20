package stringConcatenation;

public class StringExamples {
	
	public static void main(String[] args) {
		String s1="way";
		String s2="2";
		String s3="automation";
		// + - * / %
		// + --> addition, concatenation
		//  Op1+Op2
		
		//System.out.println(10+20);// 10+20
		//System.out.println(s1+s2+s3);//way2automation
		
		System.out.println(s1+10*15+s2+s3);//
		
		System.out.println(s1+s2+s3+10*15);
		System.out.println(s1+(10+15)+s2+s3);
		
		System.out.println(s1+s2+" "+s3);//way2 automation
		
		System.out.println(10-5+s1+s2+s3);
		//System.out.println(s1+s2+s3+10-3);
		
		
		
	}


}
