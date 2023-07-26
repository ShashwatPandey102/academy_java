package _230726;

// 오버라이딩 테스트 클래스
public class OverrideTest {
	public static void main(String[] args) {
		A o1 = new A();
		System.out.println("o1의 결과 ==========================");
		System.out.println(o1.i);
		System.out.println(A.si); // 스태틱 변수 (클래스 변수)는 왼쪽과 같이 인스턴스가 아닌 클래스로 접근하는 것이 원칙임 (인스턴스로 접근할 수 있긴 함)
		o1.m();
		o1.sm();
		
		B o2 = new B();
		System.out.println("o2의 결과 ==========================");
		System.out.println(o2.i);
		System.out.println(B.si);
		o2.m();
		o2.sm();
		
		A o3 = new B(); // 부모 클래스를 자식 클래스의 생성자로 생성함
		// 자식 클래스가 아닌 부모 클래스로 자동 형변환이 일어나서 부모 클래스의 객체를 생성하게 됨 (업캐스팅)
		System.out.println("o3의 결과 ==========================");
		System.out.println(o3.i);
		System.out.println(o3.si); // 일단 결과를 보기 위함임
		o3.m(); // 인스턴스 메소드만 하위 클래스의 것으로 오버라이딩됨
		o3.sm();
		
		// 스태틱 변수와 스태틱 메서드는 선언 당시의 자료형을 따라감 (B가 아닌 부모 타입인 A를 따라감)
		// 상속관계이면서 인스턴스 메소드였을 때만 오버라이딩 발생
		
	}
}

// 부모 클래스 A
class A{
	int i = 10;
	static int si = 20;
	
	void m() {
		System.out.println("A.m()");
	}
	
	static void sm() {
		System.out.println("A.sm()");
	}
}

// 자식 클래스 B
class B extends A{
	int i = 20;
	static int si = 30;
	
	void m() {
		System.out.println("B.m()");
	}
	
	static void sm() {
		System.out.println("B.sm()");
	}
}






