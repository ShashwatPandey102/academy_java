package _230731;

import java.util.Date;

public class StringSpeedTest {
	public static void main(String[] args) {
		
		Long start = System.currentTimeMillis(); // 현재 시스템 시간을 밀리세컨드로 저장
		System.out.println("start : " + start);
		
		// 일반 String에 +로 붙이는 연산
		String s = "";
		for (int i = 0; i < 10_000; i++) { // 10만 번의 문자열 객체를 생성하는 것
			s += "1";
		}
		
		Long end = System.currentTimeMillis();
		
		System.out.println(end - start + "ms");
		
		System.out.println("end : " + end);
		
		Date date = new Date(123, 11, 25); // (year, month, day)인데 year에는 1900을 더한 것이 실제 가리키는 연도의 값임
		System.out.println(date);
		
		Long time = date.getTime();
		System.out.println((time - end) / 1000 / 60 / 60 / 24 + "days"); // 2023년 11월 25일까지 남은 날
		
	}
}





