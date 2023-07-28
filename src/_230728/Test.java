package _230728;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		
		// 자바에 날짜를 다룰 수 있는 방법
		// 여러 방법이 있다. 특정 메서드들은 deprecated되어 추천되지 않지만 사용할 수는 있다.
		// 자바 기본 API (라이브러리) 중 하나인 java.util.Date를 이용해보자.
		Date date = new Date();
		
		System.out.println(date);
		
		@SuppressWarnings("deprecation")
		int year = date.getYear(); // deprecated된 메소드는 가로선이 그어짐
		System.out.println(year + 1900);
	}
}
