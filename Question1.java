package assignment2;
import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,2,3,3,4,2,2,6,3,8,4,9,10};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					if(!list.contains(arr[i])){
						list.add(arr[i]);
					}
				}
			}
		}
		System.out.println(list);

	}

}
