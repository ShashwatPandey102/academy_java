package _230728;

public class ExceptionEx1 {
	public static void main(String[] args) {
		System.out.println("main 시작");
		m1();
		System.out.println("main 끝");
	}

	static void m1() {
		m2();
	}

	static void m2() {
		m3();
	}

	static void m3() {
		
		System.out.println("m3() 시작");

		try {
			System.out.println(3 / 0); // division by zero
		} catch (Exception e) {
			System.out.println("예외 처리됨");
//			e.printStackTrace(); // 예외 발생 당시의 호출 스택에 있던 메소드의 정보와 예외 결과를 화면에 출력
//			System.out.println(e.getMessage()); // 예외에 대한 메시지 출력
			
//			System.out.println(e); // 예외 클래스 정보와 메시지 출력
			StackTraceElement[] ste = e.getStackTrace(); // 스택 트레이스 배열
			
			for(StackTraceElement s : ste) {
				System.out.println(s); // 각 예외 스택 트레이스의 발생들을 출력
//				System.out.println(s.getLineNumber()); // 각 예외 스택 트레이스의 발생 위치만 출력
			}
			
		} finally {
			System.out.println("m3 실행 완료");
		}
		
		System.out.println("m3() 끝");
	}
}









