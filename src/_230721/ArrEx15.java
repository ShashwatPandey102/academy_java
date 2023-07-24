package _230721;

import java.util.Arrays;

public class ArrEx15 {
	public static void main(String[] args) {
		
		// Arrays 클래스의 copyOf를 이용한 방법
		
		int[] arrInt = {1, 2, 3};
		int[] arrInt2 = Arrays.copyOf(arrInt, 3); // 원본 배열을 앞에서부터 복사해서 넣고 뒤의 남는 부분은 기본값으로 채움
		
		System.out.println(Arrays.toString(arrInt2));
	}
}
