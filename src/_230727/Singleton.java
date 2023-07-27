package _230727;

// 싱글톤 패턴 예시

public class Singleton {
	// 자기가 자기 객체 생성함
	private static Singleton singleton = new Singleton(); // 해당 인스턴스를 클래스 변수로 선언함으로써 해당 객체가 클래스 초기화 시 딱 한 번만 만들어지도록 한다.
	
	// 기본 생성자를 private으로 설정함으로써 외부에서 해당 객체를 생성하지 못하게 함
	private Singleton() {
		System.out.println("싱글톤 객체 생성");
	}
	
	// getter 선언. 그런데 static을 붙여서 선언한다
	public static Singleton getSingleton() { // static이 없으면 해당 객체를 생성해야만 메서드를 호출할 수 있기에 static이 강제된다.
		System.out.println("싱글톤 객체 리턴");
		return singleton;
	}
}
