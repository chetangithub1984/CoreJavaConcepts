package collectionExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	
	public static void main(String[] args) {
		HashSet set= new HashSet();
		
		
		set.add(10);
		set.add(10.5);
		set.add("java");
		set.add(10);
		set.add('a');
		set.add(true);
		set.add(null);
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
