package _230724;

public class Car {
	// 필드 선언
	String color; // 필드는 초기화에 대한 강제성이 없다.
	static String company;
	String type;
	
	// 메서드 선언
	/**
	 * 메서드 설명 등을 보통 범위주석으로 많이 하는 편이다.
	 * Car 객체가 전진하는 메소드
	 * 
	 */
	public void go() {
		long l = 20L; // 지역변수 (스태틱을 붙일 수 없음)
		System.out.println("전진하다");
	}
	
	public void back() {
		System.out.println("후진하다");
	}
	
	String get() {
		return "";
	}
	
	// 오버로딩
	String get(String a) {
		return a;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", company=" + company + ", type=" + type + "]";
	}
	
	// 같은 클래스 내에서 오버라이딩할 수 없음
//	String get() {
//		return "";
//	}
	
	
}
