package assignment2;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,20,3,7,9,2,5,9,4,12,9,23};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		
		for(int i:arr) {
			System.out.print(i+", ");
		}

	}

}
