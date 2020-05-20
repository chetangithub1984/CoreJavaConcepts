package p2;

import p1.Test;
import p3.Testing;

import static p3.Testing.*;//static import
import p1.Home;
//import p2.Test;


public class Sample {
	public static void main(String[] args) {
		Test obj = new Test();
		obj.add();
		
		Home h= new Home();
		h.display();
		
		
		Test t= new Test();
		t.add();
		
		print();
		
		Testing t1= new Testing();
		t1.sum();
		
		
		
	}
	
	

}
