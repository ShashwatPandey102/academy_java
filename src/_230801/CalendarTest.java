package _230801;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		
//		int[] months = {31, 28, ...., 31}; // 원래는 이렇게 마지막 날을 월별로 설정했어야 함

		// Calendar는 추상 클래스라 그 하위의 클래스를 호출하여 사용하여야 한다.
//		Calendar calendar = new GregorianCalendar(); // 이런 방법도 있다 (그레고리력 즉, 서력이다)

		// 또는 getInstance() static 메서드를 통해 사용한다.
		Calendar calendar = Calendar.getInstance(); // 현재 날짜 정보로 Calendar 객체를 생성함
		
		int year = calendar.get(Calendar.YEAR); // 연. 미리 정의되어있는 상수를 사용함
		System.out.println(year);
		
		int month = calendar.get(Calendar.MONTH) + 1; // 월. 1 더해야 함
		System.out.println(month);
		
		int date = calendar.get(Calendar.DATE); // 일.
		System.out.println(date);
		
		date = calendar.get(Calendar.DAY_OF_MONTH); // 일.
		System.out.println(date);
		
		int day = calendar.get(Calendar.DAY_OF_WEEK); // 요일. (일요일이 0 ~ 토요일이 6)
		System.out.println(day);
		
		calendar.set(Calendar.YEAR, 2022); // 아까 정의했던 현재 날짜 정보에서 연도만 2022로 바꿈
		System.out.println(calendar);
		
		calendar.add(Calendar.DATE, 7); // 현재 객체 날짜에서 7일 더함
		calendar.add(Calendar.DATE, -7); // 현재 객체 날짜에서 7일 뺌
		
		int totalDay = calendar.getActualMaximum(Calendar.DATE); // 그냥 이거 쓰면 편하긴 함 (Calendar.DATE 객체를 넣어서 현재 월의 실제 마지막 날짜를 구함)
		System.out.println(totalDay);
		
	
	}
}










