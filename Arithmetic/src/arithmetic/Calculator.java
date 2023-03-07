package arithmetic;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num");
		int a=sc.nextInt();
		System.out.println("enter 2nd num");
		int b=sc.nextInt();
		System.out.println("enter choice:+,-,*,/,%");
		//System.out.println("+,-,*,/,%");
		char s=sc.next().charAt(0);
		switch(s) {
		case '+':
			System.out.println("sum is "+(a+b));
			break;
		case '-':
			System.out.println("sub is "+(a-b));
			break;
		case '*':
			System.out.println("mul is "+(a*b));
			break;
		case '/':
			System.out.println("div is "+(a/b));
			break;
		case '%':
			System.out.println("sum is "+(a%b));
			break;
		 default:
			System.out.println("Invalid");
			break;
		}
			
	
	}

}
