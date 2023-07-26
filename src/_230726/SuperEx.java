package _230726;

public class SuperEx {
	public static void main(String[] args) {
		// 생성자의 첫 문장
		// this(), super() 둘 중 하나를 호출해야만 함

		Child child = new Child(); // 부모 클래스가 먼저 초기화됨 (부모는 인스턴스화가 된 게 아님)

		child.print();

//		new Child().print(); // 이렇게 해도 됨

		int[] arr = new int[5];

//		System.out.println(child.number);
	}
}

// 부모 클래스
class Parent {
	int number = 3;
	
	// 오버로딩
	public Parent() {
		
	}

	public Parent(int n) {
		super(); // 여기서도 물론 super()가 생략된 것이다. (여기서의 super는 Object 클래스를 가리킨다)
		System.out.println(n + "을 전달받음");
		System.out.println("부모 객체 생성");
	}
}

class Child extends Parent {

//	int number = 2;

	public Child() {
		super(1); // 자식 클래스 생성자에는 내부적으로 super()가 있음. 생략됨.
		System.out.println("자식 객체 생성");
	}

	void print() {
		int number = 1;
		System.out.println(number); // 메서드 내의 지역변수 number
		System.out.println(this.number); // 현재 클래스 (자식 클래스)의 number
		System.out.println(super.number); // 부모 클래스의 number
	}
}
















