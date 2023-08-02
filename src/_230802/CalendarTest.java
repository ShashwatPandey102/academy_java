package _230802;

// static화
import static java.util.Calendar.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) throws Exception {
		/**
		 * 1. 숫자를 연속 출력
		 * 1-1. 숫자는 7개 단위로 출력
		 * 2. 시작 숫자의 위치
		 * 3. 마지막 숫자가 얼마인지
		 */
		
		String input = "2023/08";
		
		// 1. 배열을 사용하여 직접 계산하기
//		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		
//		Date date = new SimpleDateFormat("yyyy/MM").parse(input);
//		int year = date.getYear() + 1900;
//		int month = date.getMonth();
//		int lastDate = arr[month];
//		if(month == 1 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
//			lastDate = 29;
//		}
//		int startDay = date.getDay();
		
		// 2. Date.getTime()으로 달 사이를 빼서 밀리초로 계산
		Date d1 = new Date(123, 7, 1); // 이번 달
		Date d2 = new Date(123, 8, 1); // 다음 달

		Long diff = d2.getTime() - d1.getTime();
		int lastDate2 = (int)(diff / 86_400_000); // Date 객체로만 해당 달의 전체 일수를 구함
		System.out.println(lastDate2);
		int firstDate2 = d1.getDay(); // 일요일이 0 ~ 토요일이 6
		System.out.println(firstDate2);
		

		// 3. Calendar를 사용하여 계산하기
		
		Calendar c = getInstance();
		c.setTime(new SimpleDateFormat("yyyy/MM").parse(input));
		
		int lastDate = c.getActualMaximum(DATE);
		int firstDate = c.get(DAY_OF_WEEK);
		
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("============================");
		
		int j = 0; // 줄바꿈용
		for (int i = 0; i < firstDate - 1; i++) {
			System.out.printf("%4s", "");
			j++;
		}
		
		for (int i = 1; i <= lastDate; i++) {
			if(i > 0) {
				System.out.printf("%4d", i);
			}
			j++;
			if(j >= 7) {
				System.out.println();
				j = 0;
			}
		}
		
	}
}











