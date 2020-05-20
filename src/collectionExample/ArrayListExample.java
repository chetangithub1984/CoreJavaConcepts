package collectionExample;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
	
		//int[] array= new int[10];
		
		ArrayList list= new ArrayList();
		
		
		// how to insert values into an arraylist
		
		list.add(10);//new Integer(10);
		list.add(10.25);//new Double(10.25)--object--. 1st index
		list.add("Java");
		list.add(true);//new Boolean(true);
		list.add('a');
		list.add(null);
		list.add(10);
		
		//list.add(e)
		
		
		// print the values available in the arraylist
		System.out.println(list);
		
		//how to get the size of the arraylist
		System.out.println(list.size());
		list.add(200);
		System.out.println(list.size());
		
		// how to fetch values available in an arraylist
		
	//	System.out.println(list.get(0));
	//	System.out.println(list.get(3));
		
		System.out.println("Printing the values available in the Arraylist");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		
		
		
		
	}

}
