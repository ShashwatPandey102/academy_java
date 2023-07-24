package _230721;

public class P5_5 {
	public static void main(String[] args) {
		
		// 1과 9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램.
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length); // 인덱스 0 ~ 2까지 나올 것
			int tmp = 0;
			
			// 여기가 섞는 부분
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp; // 서로 섞음
		}
		
		// 배열 ballArr의 앞에서 3개의 수를 ball3로 복사함
		for (int i = 0; i < 3; i++) {
			ball3[i] = ballArr[i];
		}
		
		// 또는 아래와 같은 방법으로 복사할 수도 있음
		System.arraycopy(ballArr, 0, ball3, 0, ball3.length);
		
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}
}
