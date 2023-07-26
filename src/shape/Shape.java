package shape;

public abstract class Shape { // abstract가 붙으면 추상 클래스를 의미한다 (추상 클래스라고 해서 반드시 추상 메서드만 가질 필요는 없음) -> 추상 클래스로 선언하면, 명시적으로 이 클래스로 구체화 (객체화)하지 말라는 것임)

//	double area() {
//		return 0;
//	}
	
	abstract double area(); // 구현화 부분을 굳이 없애고 싶다고 한다면, (구현 부분은 자식 클래스에서 하고 싶을 때) abstract 키워드를 붙여서 추상 메소드임을 선언하면 됨.
}
