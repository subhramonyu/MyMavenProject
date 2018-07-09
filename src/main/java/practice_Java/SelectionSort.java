package practice_Java;

public class SelectionSort {

	public void selectionSort(int arr[]){
		int l = arr.length;
		int temp = 0;
		for(int i = 0 ; i < l ; i++){
			for(int j =1 ; j < (l-i) ; j++){
				if(arr[j-1] > arr[j] ){
					temp =j;
				}
			}
		}
		
	}
	
}
