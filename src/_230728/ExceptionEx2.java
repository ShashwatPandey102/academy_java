package _230728;

public class ExceptionEx2 {
	public static void main(String[] args) {
		System.out.println("main 시작");
		m1();
		System.out.println("main 끝");
	}

	static void m1() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println("m1에서 예외 처리됨");
//			e.printStackTrace();
		}
	}

	static void m2() {
		try {
			m3();
		} catch (NullPointerException e) {
			System.out.println("m2에서 예외 처리됨");
//			e.printStackTrace();
		} finally {
			System.out.println("m2 종료");
		}
		
	}

	static void m3() {

		System.out.println("m3() 시작");

		System.out.println(3 / 0);

		System.out.println("m3() 끝");
	}
}
