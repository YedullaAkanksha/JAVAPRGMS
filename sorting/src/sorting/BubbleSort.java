package sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a= {2,5,1,6,4,3};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
			}
			sort(a);
		
			for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+" ");
		
	}
	}

public static void sort(int arr[]){
//int arr[]=new arr;
int temp;
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length-1;j++) 
	if(arr[j]>arr[j+1]) {
		temp=arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
	}
	//System.out.println(arr[i]+" ");
}
}
}