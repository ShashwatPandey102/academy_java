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

//	public static void main(String[] args) {
//		sc.nextLine(); // 이거는 Scanner의 nextLine()
//		nextLine("abcd"); // 이거는 사용자정의 StudentUtils.nextLine()
//		nextLine(); // 이건 당연히 안 됨 (이런 메소드가 없음)
//		nextLine("asdfasdf"); // 이렇게 부르면 특별히 작성하지 않으면 자신의 클래스의 메서드를 가리킴
//		StudentUtils.nextLine("asdfasdf"); 이거랑 같음
//	}
	
	public static void main(String[] args) {
		int i = 0;
		String s = "1234"; // 비숫자형을 숫자로 파싱하려고 하면 NumberFormatException이 나온다
		int j = Integer.parseInt(s);
		System.out.println(j + 100);
		
		long k = Long.parseLong(s);
		System.out.println(k);
		
		// int >> String
		String s2 = i + ""; // 이거는 연산 과정에서 느림 (근데 이게 가독성은 좋음)
		String s3 = String.valueOf(j); // 이게 속도는 더 빠름 (쓰기 귀찮고 가독성 긺)
	}

}








