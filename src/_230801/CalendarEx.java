package _230801;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println("올해 년도 : " + today.get(Calendar.YEAR));
		System.out.println("이번 달 : " + today.get(Calendar.MONTH));
		System.out.println("년도 기준 몇째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월 기준 몇째 주 : " + today.get(Calendar.WEEK_OF_MONTH)); // 이것도 기준이 약간 다름 (보통 해당 주차의 1일이 수요일 이전인가 이후인가에 따라 다르고, 회사별로 다름)
		System.out.println("일자 : " + today.get(Calendar.DATE));
		System.out.println("일자 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("년도 기준 날짜 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일 (일:1) ~ (토:7) : " + today.get(Calendar.DAY_OF_WEEK)); // 이게 좀 헷갈림 DAY_OF_WEEK가 요일임
		System.out.println("월 기준 몇째 요일? : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 해당 월에서 몇 번째 요일인지 (ex) 2번째 일요일, 4번째 일요일에 휴무라고 하면 그런 느낌)
		
	}
}
