package arrayExamples;

public class TwoDArrayExample {

	public static void main(String[] args) {
		int[][] array = new int[2][3];//

		// array[0]=100;
		int num=100;
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
			{
				array[i][j]=num;
				num=num+100;
				System.out.println(array[i][j]);
			}
		}

	}

}
