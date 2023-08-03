package marble;

import java.util.Scanner;

// 공통 유틸 메서드
public class Utils {
	private static Scanner scanner = new Scanner(System.in);

	// 메시지 출력하며 입력받아 문자열 반환
	public static String nextLine(String msg) {
		System.out.print(msg);
		return scanner.nextLine();
	}

	// 메시지 출력하며 입력받아 정수 반환
	public static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
}





