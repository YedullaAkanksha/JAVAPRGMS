package sorting;
import java.util.Arrays;
public class SelectionSort {
		public static void main(String[] args) {
			int[] num= {8,7,6,5,4};
			System.out.println("before sorting"+ Arrays.toString(num));
			
			System.out.println("After sorting"+ Arrays.toString(selectionsort(num)));
			//System.out.println("After sorting"+ Arrays.toString(selectionsort(num));
		}





public static void selectionsort(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=1;j<i;j++) {
			while(arr[j]<arr[i]) {
				arr[i]=arr[j];
				
			}
			System.out.println(arr[i]+"");
		}
	}
}
}