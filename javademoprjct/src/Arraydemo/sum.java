package Arraydemo;

public class sum {
		public static void main(String[] args) {
				int a[]= {1,2,3,4,5};
				int sum=0;
				for(int i:a) {
					if(a[i]%2==0)
					sum+=a[i];
				}
		
			System.out.println(sum);


}}

