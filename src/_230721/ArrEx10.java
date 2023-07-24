package _230721;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrEx10 {
	public static void main(String[] args) {
		
		int[][] matrix = new int[3][3];
		
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		int[][] matrix3 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		System.out.println(Arrays.deepToString(matrix));
		System.out.println(Arrays.deepToString(matrix2));
		System.out.println(Arrays.deepToString(matrix3));
		
		// 배열 내부 요소를 확인하는 방법
		// for를 통한 직접 탐색
		// Arrays 클래스를 활용한 탐색
		
		int[] arr = {3, 4, 5, 6};
		System.out.println(Arrays.toString(arr));
		
		// 다차원 배열의 경우 Arrays.deepToString 활용 (1차원 배열은 안 됨, 다차원 배열만 됨)
		int[][] arr2 = {{3, 4}, {5, 6}, {7, 8}};
		System.out.println(Arrays.deepToString(arr2));
		
		// 0부터 10까지 (10 포함하여 IntStream 클래스 이용해서 Array로 만들어서 출력함)
		int[] test = IntStream.rangeClosed(0, 10).toArray();
		System.out.println(Arrays.toString(test));
		
	}
}








