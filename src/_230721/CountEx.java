package _230721;

import java.util.Arrays;

public class CountEx {
	public static void main(String[] args) {
		
		// 빈도수 구하기
		
		// 압축에 사용한다
//		String str = "1111112345123451234522"; // 자바에서는 char가 2바이트
//		압축에서는 어떠한 문자의 빈도수에 따라 그걸 특정 비트로 치환해서 압축한다.
//		char[] chs = str.toCharArray();
//		System.out.println(chs); // 문자 배열은 그냥 출력해도 자동으로 String처럼 출력된다
		
		int[] numArr = new int[100];
		int[] counter = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10); // 0 ~ 9 사이의 난수
		}
		
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}
		
		System.out.println(Arrays.toString(counter));
		
	}
}
