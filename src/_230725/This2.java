package _230725;

public class This2 {
	int i = 10; // instance variable
	static int si = 20; // class variable
	
	public static void main(String[] args) {
		System.out.println(This2.si); // 객체 생성 없이 바로 사용 가능
		This2.si = 30; // 변경 역시 가능
		
//		System.out.println(This2.i); // 인스턴스 변수 : 인스턴스가 있어야 함

		System.out.println(new This2().i); // 이렇게 할 수도 있음.
		
		new This2().m();
	}
	
	// 클래스 변수 (static이 붙음)
	// 인스턴스 변수
	
	// 클래스 메서드 (static이 붙음)
	// 인스턴스 메서드
	
	// 클래스 메서드
	static void sm() {
		System.out.println("sm()");
		
//		m(); // Cannot make a static reference to the non-static method m() from the type This2
	}
	
	// 인스턴스 메서드
	void m() {
		i = 30; // 인스턴스 메서드 내에선 인스턴스 변수에 접근 가능 (어차피 둘 다 객체 생성해야 하기에)
		// 근데 사실은 this.i = 30; 이렇게 된 거였고 this.가 생략된 거였음
		System.out.println("m()");
		
		m2(); // 이것도 this.m2(); 였음
		
		System.out.println(this); // 미래에 생성될 객체(인스턴스)의 주소값
		System.out.println(si); // 클래스 변수이기 때문에 접근 가능
	}
	
	void m2() {
		this.i = 40;
		System.out.println("m2()");
		
//		this.m();
	}
	
	// 클래스 메서드 내에서 인스턴스 메서드 호출이 되는가? 안 됨 (하지만 인스턴스 메서드는 해당 인스턴스가 생성이 되어야 하므로 안 됨)
	// 인스턴스 메서드 내에서 클래스 메서드 호출이 되는가? 됨 (어차피 클래스 메서드는 해당 클래스 로드와 동시에 이뤄짐)
	
	
}





















