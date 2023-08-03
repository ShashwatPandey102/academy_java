package _230803;

import lombok.AllArgsConstructor;

public class ConcreteClassTest {
	public static void main(String[] args) {
		
		Addr addr = new Addr(1, "홍길동");
		addr.print();
		
		// Addr 객체를 사용하면서 print() 메서드를 실행 시 다른 행위를 하고 싶을 때
		Addr a = new Addr2(2, "고길동"); // 다형성을 이용한 경우이다. 이 때 생성자를 자식 클래스로 하면, 오버라이딩된 메서드는 자식 클래스의 메서드를 사용하게 된다.
		a.print();
		
		// 익명 클래스는 인터페이스뿐만 아니라 구상 클래스로도 할 수 있다.
		// 이번엔 extends로 상속해서 오버라이딩하지 않고 메서드를 다르게 실행하는 방법에 대해 알아보자.
		Addr a2 = new Addr(3, "이길동") { // 익명 클래스 구간 (생성자는 부모 것을 썼기 때문에 따로 생성자는 못 만듦)
			// 말 그대로 1회성으로 사용할 때 하는 것이다.
			void print() { // 부모 클래스의 print() 오버라이딩
				System.out.println("구상 클래스 오버라이드");
			}; 
		};
		
		a2.print();
	}
}

@AllArgsConstructor
class Addr{
	int no;
	String name;
	
	void print() {
		System.out.println("번호는 " + no + ", 이름은 " + name);
	}
}


class Addr2 extends Addr{

	public Addr2(int no, String name) {
		super(no, name);
	}
	
	@Override
	void print() {
		System.out.println("이름은 " + name + ", 번호는 " + no);
	}
}








