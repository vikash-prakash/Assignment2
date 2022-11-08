package assignment2;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,20,3,7,9,2,5,9,4,12,9,23};
		int len = arr.length;
		
		Question2 obj = new Question2();
		obj.quickSortRecursion(arr,0,len-1);
		obj.printArray(arr);
		

	}
	
	int partition(int arr[], int low, int high) {
		int pivot = (low+high)/2;
		
		while(low<=high) {
			
			while(arr[low]<arr[pivot]) {
				low++;
			}
			
			while(arr[high]>arr[pivot]) {
				high--;
			}
			
			if(low<=high) {
				int temp=arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}
	
	void quickSortRecursion(int arr[],int low, int high){
		
		int p = partition(arr,low,high);
		if(low<p-1) {
			quickSortRecursion(arr,low,p-1);
		}
		if(p<high) {
			quickSortRecursion(arr,p,high);
		}
			
		
	}
	
	void printArray(int arr[]){
		
		for(int i: arr) {
			System.out.print(i+", ");
		}
	}

}
