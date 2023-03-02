package methodemo;

import java.util.Scanner;

public class method {
	public void even(int n) {
		if(n%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}	
	}
	public static void display(int n) {
		int num=n;
		System.out.println("num is"+ num);
		
	}
	public static void main(String[] args) {
		method m=new method();
		m.even(10);
		display(1);
		
	}

}
