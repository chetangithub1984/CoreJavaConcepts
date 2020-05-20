package arrayExamples;

public class ThreeDArray {

	public static void main(String[] args) {
		
		int[][][] array= new int[2][3][4];
		
		
		for(int i=0;i<array.length;i++)//i=0
		{
			for(int j=0;j<array[i].length;j++)//j=0
			{
				for(int k=0;k<array[i][j].length;k++)//k=0
				{
					array[0][0][0]=(int)(Math.random()*1000);//520
					System.out.println(array[i][j][k]);
				}
			}
			
		}
		
		
	}
}
