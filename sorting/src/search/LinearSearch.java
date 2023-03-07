package search;

public class LinearSearch {
	public static void main(String[] args) {
		int searchitem=7;
		int[]arr= {3,6,32,7,8};
		int index=linearsearch(arr,searchitem);
		if(index==-1) {
			System.out.println("Item not found");	
		}
		System.out.println("Item found at "+index);
	}

private static int linearsearch(int[] arr,int searchitem) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==searchitem) {
			return i;
		}
	}
	return -1;
}
}