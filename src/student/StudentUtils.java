package student;

import java.util.Scanner;

public class StudentUtils {
	// 입력받고 자료를 담아놓는 등의 자주 사용하는 메서드들을 유틸리티화함 (모듈화함)
	// 예를 들어 Scanner 등의 공통 객체를 여기서 생성해서 간단히 불러와서 사용함
	static Scanner sc = new Scanner(System.in); // static 메서드 내에서 사용할 것이기 때문에 여기도 static 키워드를 붙임

	// 입력 메시지를 출력하면서 입력받아서 String으로 반환하는 함수를 모듈화
	static String nextLine(String msg) {
		System.out.print(msg + " ");
		return sc.nextLine();
	}

	// 위와 같으나 이번엔 int형으로 반환할 것임
	// 근데 아래와 같이 메소드간에 너무 의존성이 있어도 좋지 않을 수도 있음.
	static int nextLineToInteger(String msg) {
//		아래처럼 하면 메소드간 의존성은 없으나 너무 길어짐
//		System.out.print(msg);
//		return Integer.parseInt(sc.nextLine());

		return Integer.parseInt(nextLine(msg + " "));
	}
}
