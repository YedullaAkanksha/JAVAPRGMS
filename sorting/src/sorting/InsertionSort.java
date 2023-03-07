package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] num= {8,7,6,5,4};
		System.out.println("before sorting"+ Arrays.toString(num));
		System.out.println("After sorting"+ Arrays.toString(insertionsort(num)));
	}
	static int[] insertionsort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				for(int j=1;j<i;j++) {
					if(arr[i]<arr[j]) {
						
					}
				}
			}
		}
		
	}
}
