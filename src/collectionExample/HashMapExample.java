package collectionExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap map= new HashMap();
		
		map.put("first", 1);
		map.put("second", 100.25);
		map.put("third", 100.25);
		map.put(100, "selenium");
		//map.put(null, null);
		map.put("first", 100000);
		System.out.println(map);
		
		//System.out.println(map.get("first"));
		//System.out.println(map.get(100));
		//System.out.println(map.get("hgjhgh"));
		
		Set setOfKeys=map.keySet();
		
		Iterator itr=setOfKeys.iterator();
		while(itr.hasNext())
		{
			
			Object key=itr.next();
			
			System.out.println("Key-->"+ key+" Value-->"+map.get(key));
		}
		
		
	}

}
