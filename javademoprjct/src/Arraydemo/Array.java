package Arraydemo;

public class Array {
public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		printArray(a);
		a[1]=7;
		printArray(a);
		a[3]=new Integer(33);
		printArray(a);
	}
	private static void printArray(int a[]) {
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+ ",");
	}
	System.out.println();

}}
