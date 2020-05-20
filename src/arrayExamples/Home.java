package arrayExamples;

public class Home {
	public static void main(String[] args) {
		
		
		
		int[][] array= new int[2][];
		
		
		array[0]=new int[3];
		array[1]= new int[10];
		
		for(int i=0;i<array.length;i++)//i=1
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]= (int)(Math.random()*1000);
				System.out.println(array[i][j]);
			}
		}
		
		
		
		
		
		
		
		
	}

}
