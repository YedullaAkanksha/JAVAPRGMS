package search;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int searchitem=7;
		int[]arr= {1,2,3,4,5,7};
		System.out.println("before"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("before"+Arrays.toString(arr));
		int index=binarysearch(arr,searchitem);
		if(index==-1) {
			System.out.println("Item not found");	
		}
		System.out.println("Item found at "+index);
	}

private static int binarysearch(int[] arr,int searchitem) {
	int frst=0;
	int last=arr.length-1;
	int mid=(frst+last)/2;
	while(frst<=last) {
		if(searchitem>arr[mid]) {
			frst=mid+1;
		}else if(searchitem==arr[mid]) {
			return mid;
		}else {
			last=mid-1;
		}
		mid=(frst+last)/2;	
			
	}return 0;
}
}