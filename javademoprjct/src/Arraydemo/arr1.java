package Arraydemo;

public class arr1 {
	public static void main(String[] args) {
		int a[]= {1,2,3,1,2};
	}
	public static void Arr(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==1 && a[i+1]==2) {
				a[i+1]=0;
				System.out.println(a[i]+ ",");
			
			}
			
		}
		for(int i=0;i<a.length;i++) {
	
				System.out.println(a[i]+ ",");
			
	}
	
}
}