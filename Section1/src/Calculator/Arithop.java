package Calculator;

import java.util.Scanner;

public class Arithop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("enter choice");
		int a=sc.nextInt();
		System.out.println("enter 1st num");
		int b=sc.nextInt();
		System.out.println("enter 2nd num");
		System.out.println("1.add\n2.sub\n3.sub\n4.div\n5.exit");
		if(n==1) {
			System.out.print("sum is:"+ (a+b));
		}
		if(n==2){
			System.out.print("mul is:"+ (a*b));
		}
	}

}
