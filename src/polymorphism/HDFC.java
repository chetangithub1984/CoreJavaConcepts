package polymorphism;

public class HDFC extends RBI{
	
	public static void main(String[] args) {
		HDFC obj= new HDFC();
		System.out.println(obj.getHomeLoanROI());
	}
	
	public double getHomeLoanROI()
	{
		return 9.5;
	}
	
	public double getCarLoanROI()
	{
		return 11.5;
	}
	
	public double getEducationLoanROI()
	{
		return 12.5;
	}

}
