package polymorphism;

public class BABC {
	
	public static void main(String[] args) {
		
		int i=10;// primitive
		
		Integer obj= new Integer(100);//primitive--> Object
		System.out.println(obj);
		
		Double d=new Double(10.25);
		Double d1= 100.5;
		
		// Number --> Integer, Byte,Short,Long,Float,Double
		
		// polymorphic reference:-You can store the object of child class in the Parent
			//class/interface reference variable
		// Webdriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		
		
		
		
		String s= new String("dssd");
		System.out.println(s);
	}

}
