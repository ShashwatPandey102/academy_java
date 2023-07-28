package student.util;

import java.util.Scanner;

// util (유틸) 클래스

public class StudentUtils {
	
	private static Scanner sc = new Scanner(System.in);

	public static String nextLine(String msg) {
		System.out.print(msg + " ");
		return sc.nextLine();
	}

	public static int nextLineToInteger(String msg) {
		return Integer.parseInt(nextLine(msg + " "));
	}

}

