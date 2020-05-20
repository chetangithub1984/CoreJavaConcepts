package arrayExamples;

public class TwoDArray {
	
	public static void main(String[] args) {
		int[] array= new int[20];
		
		/*
		 * Array--> static variable -->public static final int length
		 * 
		 * final--> keyword--> class, method , variables
		 */
		
		for(int i=0;i<array.length;i++)
		{
		
			array[i]=(int)(Math.random()*1000);
			System.out.println(array[i]);
		}
		
		
		
	}

}
