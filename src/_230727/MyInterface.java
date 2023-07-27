package _230727;

// 추상화 정도가 심한 클래스
public interface MyInterface {
	// 상수
	int i = 1; // 자동으로 public static final이 된다.
	
	// 인터페이스는 일반 변수 허용 안 함. (무조건 상수)
	// public static final이 붙은 거를 전역적 상수라고 한다. (static이 붙으면 전역적이라는 뜻. 왜냐면 클래스 변수 또는 클래스 메서드니까)
	
	// 추상 메서드
	void run(String str); // 자동으로 public abstract가 붙는다.
	
	// 디폴트 메서드
	// 클래스 메서드 (스태틱 메서드)
}
