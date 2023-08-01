package _230801;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx2 {
	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();

		// 시간 관련 부분은 getActualMaximum()만 잘 사용하면 좋다 (해당 달의 마지막 일자를 구함)
		// 굳이 쳐보진 않겠음

		// 에포크 타임 뽑아보기

		today.getTimeInMillis(); // 현재 날짜를 에포크 타임부터의 밀리세컨드로 반환함
		Date date = today.getTime(); // Calendar 객체를 Date 객체로 변환할 때 사용함

		Calendar c2 = Calendar.getInstance();
		c2.setTime(date); // Date 객체를 Calendar 객체로 변환할 때 사용함

		c2.setTimeInMillis(date.getTime()); // Date.getTime()은 밀리세컨드(Long)을 반환하므로, 이렇게 해서 설정할 수도 있음

		// 위와 같이 Date <-> Calendar 객체를 상호변환할 수 있음.

		// 2035년 1월 1일까지 몇일 남았는지 계산
		Calendar c3 = Calendar.getInstance();
		c3.set(2035, 0, 1, 0, 0, 0);

		Calendar now = Calendar.getInstance();

		Long diff = c3.getTimeInMillis() - now.getTimeInMillis();

		diff /= 86_400_000;

		System.out.println(String.format("2035년 1월 1일까지 %d일 남았습니다", diff));

		// 태어난지 며칠 지났는지
		Calendar c4 = Calendar.getInstance();
		c4.set(1993, 8, 17, 0, 0, 0);

		diff = now.getTimeInMillis() - c4.getTimeInMillis();

		diff /= 86_400_000;

		System.out.println(String.format("태어난지 %d일 지났습니다", diff));

		Integer[] arr = { 3, 5, 1, 2, 3, 5, 7, 9, 4, 3 };
		
//		Arrays.sort(arr); // 퀵소트 정렬
		Arrays.sort(arr, (a, b) -> b - a); // 내림차순 정렬 (람다식, Comparator 인터페이스 사용)
		
		System.out.println(Arrays.toString(arr));
	}
}











