package polymorphism;

public class SBI extends RBI {

	public static void main(String[] args) {

		/*SBI obj = new SBI();
		//System.out.println(obj.getHomeLoanROI());
		
		RBI ref=new SBI();//polymorphic reference
		System.out.println(ref.getHomeLoanROI());//
		System.out.println(ref.getValue());
		ref.print();
		//SBI s1= new RBI();
*/
	}

	public double getHomeLoanROI()
	{
		return 8.0;
	}
	
	public double getCarLoanROI()
	{
		return 12.0;
	}
	
	public double getEducationLoanROI()
	{
		return 13.5;
	}
	public void print()
	{
		
	}

}
