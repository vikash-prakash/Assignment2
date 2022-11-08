package assignment2;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,20,3,7,9,2,5,9,4,12,9,23};
		int temp=0,min;
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			temp= arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		
		for(int i:arr) {
			System.out.print(i+", ");
		}

	}

}
