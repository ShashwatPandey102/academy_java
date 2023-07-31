package _230731;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		Date date = new Date(70, 0, 1, 9, 0, 0); // 에포크 타임 : 1970년 1월 1일 오전 9시 0분 0초 (KST라서 9가 0임)
		
		System.out.println(date.getTime());
	}
}
