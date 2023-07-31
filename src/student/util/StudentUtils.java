package student.util;

import java.util.Scanner;

// util (유틸) 클래스

public class StudentUtils {

	private static Scanner sc = new Scanner(System.in);

	// 메시지를 출력하면서 문자열 입력받음
	public static String nextLine(String msg) {
		System.out.print(msg + " ");
		return sc.nextLine();
	}

	// 메시지 출력하면서 문자열 입력받아 정수형으로 반환함
	public static int nextLineToInteger(String msg) {
		return Integer.parseInt(nextLine(msg + " "));
	}

}
