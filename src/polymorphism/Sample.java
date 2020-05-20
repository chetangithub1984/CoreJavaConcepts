package polymorphism;

public class Sample {
	
	
	public static void main(String[] args) {
		
		Sample s= new Sample();
		s.add(1,2,3,4,5,60);
		s.add(1,22,33,4,5,66,77,88,99);
		s.add(11,22);
		s.add(1,2,3,4,5,6,7,8,9,11,22,44,55,66,77,88);
		
	}
	
	public void main(int a )
	{
		
	}
	
	public void main(String args)
	{
		
	}
	
	public void add(int... var)// var-args
	{
		int sum=0;
		for(int i=0;i<var.length;i++)
		{
			sum=sum+var[i];
		}
		System.out.println(sum);
		
	}
	public void add(int a, int b)
	{
		
	}

}
