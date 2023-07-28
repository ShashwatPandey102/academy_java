package _230728;

public class ExceptionEx6 {
	public static void main(String[] args) {
		System.out.println("main 실행");
		
		try {
			first();
		} catch (Exception e) { // 여기서 처리를 해야 함
			System.out.println(e.getMessage());
		}
	}
	
	// 예외 발생 시 main() 메서드로 책임 넘김
	static void first() throws Exception{
		System.out.println("first 실행");
		second();
		System.out.println("first 이후");
	}
	
	// 예외 발생 시 first() 메서드로 책임 넘김
	static void second() throws Exception{
		System.out.println("second 실행");
		throw new Exception("예외 발생");
	}
}
