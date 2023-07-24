package _230721;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		
		// 버블 정렬 (Bubble Sort)
		int[] arr = {3, 4, 1, 8, 2, 5, 7, 6};
//		int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			boolean change = false;
			
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					
					change = true;
				}
			}
			
			if(!change) {
				break;
			}
			
			System.out.println(Arrays.toString(arr));
		}
		
		// 기대 결과값 = [1,2,3,4,5,6,7,8]
	}
}
