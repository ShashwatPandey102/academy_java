package _230728;

public class ExceptionEx5 {
	
	// checked : RuntimeException을 제외한 Exception 및 그 자손들
	// unchecked : RuntimeException 및 그 자손들
	
	public static void main(String[] args) {
		m();
		
		String str = "abcde";
		str.charAt(4);
		
		System.out.println("프로그램 시작");

		try {
			throw new Exception("예외 발생"); // 개발자가 임의로 예외 던짐
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
//		throw new Exception("예외 발생"); // 단독으로 쓸 수 없음 (try catch가 강제됨)
//		throw new RuntimeException("런타임 예외 발생"); // 단독으로 쓸 수 있음 (try catch 강제되지 않음)
		
		System.out.println("프로그램 종료");
	}
	
	
	static void m() {
//		Exception e = new Exception("예외 발생");
		throw new RuntimeException("런타임 예외 발생");
	}
}
