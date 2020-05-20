package polymorphism;

public class FirefoxDriver extends WebDriver{

	public void click()
	{
		System.out.println("Firefox Driver click() executed");
	}
	
	
	public void sendKeys(String str)
	{
		System.out.println("Firefox Driver sendKeys() executed");
	}
}

