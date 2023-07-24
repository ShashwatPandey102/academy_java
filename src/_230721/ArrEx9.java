package _230721;

import java.util.Arrays;

public class ArrEx9 {
	// 접근제한자 [Static여부] 반환타입 함수명(매개변수){ }
	public static void main(String[] args) { // args는 arguments의 약자로, 매개변수 또는 인자라는 뜻임
		
		System.out.println("첫번째 값 : " + args[0]);
		System.out.println("두번째 값 : " + args[1]);
		
		System.out.println("args : " + args);
		
		int[][] matrix = new int[3][3]; // 2차원 배열이면서 행, 열이 3개씩 있음
		
		// 근데 이렇게는 안 씀
//		int[] matrix2[] = new int[3][3]; // 이렇게 해도 2차원 배열이 된다.
		
		matrix[0][0] = 1; // int형
//		matrix[0] // int 1차원 배열

		// 다차원 배열도 한 번에 출력 가능
		System.out.println(Arrays.deepToString(matrix));
		
		int[] arr = matrix[0];
		System.out.println(Arrays.toString(arr)); // 단차원 배열 출력 가능
		
		int[][] matrix2 = { {1} }; // 
		System.out.println(Arrays.deepToString(matrix2));
		
		int[][] matrix3 = { {1, 2, 3}, {4, 5}, new int[4], arr };
		System.out.println(Arrays.deepToString(matrix3)); // 위와 같이 다양한 방법으로 배열을 혼합할 수 있으며, 하위 배열마다 길이가 다르게 할 수도 있다.
		
	}
}
