package _230720;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {

		// 로또 번호를 담아둘 길이가 6개인 정수 타입 배열 변수 생성
		// 1 ~ 45까지 번호 중 하나를 뽑음
		// 만약 뽑은 번호가 배열에 있다면 다시 뽑고, 없다면 배열에 넣는다
		// 6개의 번호를 다 뽑을 때까지 반복한다
		// 6개의 번호를 출력한다.

		int[] lotto = new int[6];

		int count = 0;

		main: while (true) {

			// Math.random()은 0 이상 1 미만의 double 타입의 난수를 생성
			int rand = (int) (Math.random() * 45) + 1;

			for (int i = 0; i <= count; i++) {
				if (rand == lotto[i]) {
					continue main;
				}
			}

			lotto[count] = rand;
			count++;

			if (count >= 6) {
				break;
			}
		}

		System.out.println(Arrays.toString(lotto));
		
		// 60부터 100까지 정수, 단 5의 배수
//		for (int i = 0; i < 100; i++) {
//			
//			int rand = (int)(Math.random() * 9) * 5 + 60; // 60부터 100까지 5의 배수
//			int rand2 = (int)(Math.random() * 41) + 60;
//			
//			System.out.println(rand);
//		}
		
	}
}







