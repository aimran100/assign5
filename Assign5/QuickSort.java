

public class QuickSort {

	public static void main(String[] args) {
		int[] array = {3,1,8,7,6,2,4,9,5};
		
		showArray(array);
		quickSort(array);
		showArray(array);
		

	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<theArray.length;index++) {
			if(index!=0) {
				System.out.printf(", ");
			}
			System.out.printf("%d",theArray[index]);
		}
		System.out.printf("]\n");
	}
	
	public static void quickSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive quickSort *
		//**********************************************
		quickSort(array,0,array.length-1);
	}
	
	public static void quickSort(int[] array, int left, int right) {
		if(left < right) {
			int lIndex = left - 1;
			int pivot = array[right];
			for( int rIndex = left; rIndex < right; rIndex++) {
				if(array[rIndex] <= pivot) {
					lIndex++;
					int temp = array[lIndex];
					array[lIndex] = array[rIndex];
					array[rIndex] = temp;
				
				}
			}
			lIndex++;
			
			int temp = array[lIndex];
			array[lIndex] = array[right];
			array[right] = temp;
			quickSort(array, left, lIndex - 1);
			quickSort(array, lIndex + 1, right);
			
		}
		
		
	}
	

}
