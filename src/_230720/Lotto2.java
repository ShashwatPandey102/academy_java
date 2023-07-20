package _230720;

import java.util.Arrays;

public class Lotto2 {
	public static void main(String[] args) {
		
		// shuffle을 이용한 로또 번호 생성
		
//		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int[] arr = new int[45];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		// 순차적으로 각 인덱스 번째 요소를 랜덤번째와 서로 교환한다
		
		int rand = 0;
		
		// 시간복잡도상 n^2가 아닌 n번이다 (더 효율적임)
		for (int i = 0; i < arr.length; i++) {
			rand = (int)(Math.random() * arr.length);
			
			int a = arr[i];
			int b = arr[rand];
			
			// 비트 연산
			a = a ^ b; // a의 상태는 a ^ b를 한 번 한 상태
			b = b ^ a; // b의 상태는 a ^ b를 두 번 한 상태 (a ^ b ^ b) -> a
			a = a ^ b; // a의 상태는 a ^ b ^ a를 한 상태 (b ^ a ^ a) -> b 

			arr[i] = a;
			arr[rand] = b;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}



