package _230720;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrEx9 {
	public static void main(String[] args) {

		// 최대값 찾기
		int[] arr = {5, 8, 4, 3, 9, 2};

		// 해당 array 안에서 비교하므로 min, max로 첫번째 원소를 지정해준다
		int max = arr[0];
		int min = arr[0];
		
		int search = 1; // 2라는 값의 인덱스를 찾고 싶음
		int index = -1; // 초기 인덱스값은 -1
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) { // 어차피 큰 거 먼저 계산하므로 else if로 해줘도 됨
				min = arr[i];
			}
			
			if(arr[i] == search) {
				index = i;
			}
		}
		
//		for(int v : arr){
//			if(v > max) {
//				max = v;
//			}
//		}
		
//		Arrays 클래스를 사용한 방법
		int max2 = Arrays.stream(arr).max().getAsInt();
		int min2 = Arrays.stream(arr).min().getAsInt();
//		Arrays 클래스를 사용한 방법
//		다만 아래 방법은 integer가 아닌 래퍼 클래스인 Integer 배열인 경우 가능하다.
		int index2 = Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(search);
		
		String str = "abcdeabcde";
		System.out.println(str.indexOf("e")); // String.indexOf : 해당 문자를 찾아 처음 나오는 index를 반환함
		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.charAt(4));
		
		System.out.printf("최댓값 : %d, 최솟값 : %d, %d의 인덱스 : %d", max, min, search, index);
		System.out.println();
		System.out.printf("최댓값 : %d, 최솟값 : %d, %d의 인덱스 : %d", max2, min2, search, index2);
		
	}
}







