package _230721;

import java.util.stream.IntStream;

public class ArrPractice {
	public static void main(String[] args) {
		
		System.out.println("1번 : 2, 4");
		System.out.println("========================");

		System.out.println("2번 : 2차원 배열의 길이 : 4, arr[2]의 길이 : 3");
		System.out.println("========================");
		
		// 합계 점수, 평균 점수 구하기
		int[] score = {90, 80, 60, 100};
		int totalScore = 0;
		
		double avgScore = 0;
		
		totalScore = IntStream.of(score).sum();
		avgScore = (double)totalScore / score.length;

		System.out.println("3번 : ");
		System.out.println("합계 점수 : " + totalScore);
		System.out.println("평균 점수 : " + avgScore);
		System.out.println("========================");
		
		// 각각의 값을 다른 배열의 해당 인덱스 값에 제곱값을 대입하는 코드
		
		int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] num2 = new int[10];
		
		for (int i = 0; i < num1.length; i++) {
			num2[i] = (int)Math.pow(num1[i], 2);
		}
		
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
		System.out.println("========================");
		
	}
}
