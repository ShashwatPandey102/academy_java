package homework;

import java.util.Scanner;

public class CalUtils {
	private static Scanner sc = new Scanner(System.in);
	
	public static String nextLine(String msg) {
		System.out.printf(msg + " ");
		return sc.nextLine();
	}
}
