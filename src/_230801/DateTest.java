package _230801;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		// Date 클래스의 기본 사용 예제
		Date date = new Date();
		
		int year = date.getYear() + 1900; // 연은 1900을 빼서 저장돼있음 (사용하려면 +1900)
		int month = date.getMonth() + 1; // 월은 0 ~ 11까지 있음 (사용하려면 +1)
		int date2 = date.getDate(); // 일
		int day = date.getDay(); // 요일 (1 ~ 7)
		
		int hour = date.getHours(); // 시
		int minute = date.getMinutes(); // 분
		int second = date.getSeconds(); // 초
		
		System.out.println("연 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + date2);
		System.out.println("요일 : " + day);
		System.out.println("시 : " + hour);
		System.out.println("분 : " + minute);
		System.out.println("초 : " + second);
		
	}
}
