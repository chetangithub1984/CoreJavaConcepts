package abstractClassAndInterface;

public abstract class WebDriver {
	
	int var=100;
	public abstract void click();
	
	public final abstract void sendKeys(String str);
	
	public abstract  void clear();
	
	public  void add()
	{
		
	}
	
	//final --> variable, methods, classes
	// final--> variable--> that variable becomes constant.
	//final--> method-->Then that method can not be overriden
	//final--> class--> then no class can inherit that final class
	
	
	

}
