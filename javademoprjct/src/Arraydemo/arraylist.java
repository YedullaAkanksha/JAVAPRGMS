package Arraydemo;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		demo2();demo1();
	}
	private static void demo1() {
		ArrayList lst=new ArrayList();
		lst.add(10);
		lst.add(20);
		lst.add(30);
		System.out.print(lst);
	}
	private static void demo2() {
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=10;i<=100;i=i+10) {
			l.add(i);
			l.add(3,101);
			l.remove(1);
			
		}
		System.out.println(l);
	}
	
}
	
}
