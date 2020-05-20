package polymorphism;

public class SampleWebSite {
	public static void main(String[] args) {
		
		String bankname="pnb";
		String loanType="carloan";
		SampleWebSite obj = new SampleWebSite();
		System.out.println(obj.getROI(bankname, loanType));
	}
	
	public double getROI(String bankName, String loanType)
	{
		if(loanType.equalsIgnoreCase("homeloan"))
		{
			return SampleWebSite.getBankObject(bankName).getHomeLoanROI();
		}
		else if(loanType.equalsIgnoreCase("carloan"))
		{
			return SampleWebSite.getBankObject(bankName).getCarLoanROI();
		}
		else if(loanType.equalsIgnoreCase("educationloan"))
		{
			return SampleWebSite.getBankObject(bankName).getEducationLoanROI();
		}
		else
		{
			return SampleWebSite.getBankObject(bankName).getHomeLoanROI();
		}
		
		/*if(bankName.equalsIgnoreCase("sbi"))
		{
		    
		    if(loanType.equalsIgnoreCase("homeloan"))
		    {
		    	return SampleWebSite.getBankObject(bankName).getHomeLoanROI();
		    }
		    else if(loanType.equalsIgnoreCase("carloan"))
		    {
		    	return sbi.getCarLoanROI();
		    }
		    else if(loanType.equalsIgnoreCase("educationLoan"))
		    {
		    	return sbi.getEducationLoanROI();
		    }
		}
		else if(bankName.equalsIgnoreCase("pnb"))
		{
			PNB pnb= new PNB();
		    if(loanType.equalsIgnoreCase("homeloan"))
		    {
		    	return pnb.getHomeLoanROI();
		    }
		    else if(loanType.equalsIgnoreCase("carloan"))
		    {
		    	return pnb.getCarLoanROI();
		    }
		    else if(loanType.equalsIgnoreCase("educationLoan"))
		    {
		    	return pnb.getEducationLoanROI();
		    }
		}
		else if(bankName.equalsIgnoreCase("hdfc"))
		{
			HDFC hdfc= new HDFC();
		    if(loanType.equalsIgnoreCase("homeloan"))
		    {
		    	return hdfc.getHomeLoanROI();
		    }
		    else if(loanType.equalsIgnoreCase("carloan"))
		    {
		    	return hdfc.getCarLoanROI();
		    }
		    else if(loanType.equalsIgnoreCase("educationLoan"))
		    {
		    	return hdfc.getEducationLoanROI();
		    }
		}
		else
		{
			
		}*/
						
		
	}
	
	public static  RBI getBankObject(String bankName)
	{
		
		 if(bankName.equalsIgnoreCase("sbi"))
		 {
			 return new SBI();
		 }
		 else if(bankName.equalsIgnoreCase("pnb"))
		 {
			 return new PNB();
		 }
		 else if(bankName.equalsIgnoreCase("hdfc"))
		 {
			 return new HDFC();
			 
		 }
		 else
		 {
			 return new RBI();
		 }
		
		
		
		
	}

}
