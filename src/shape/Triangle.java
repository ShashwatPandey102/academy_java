package shape;

public class Triangle implements Shape2D{ // 만약 추상 메서드가 하나라도 있는 부모 클래스를 상속받았는데 이를 구현하지 않으면, The type Triangle must implement the inherited abstract method Shape.area() 에러가 뜬다. 
	// 방법이 두 가지가 있음.
	// 1. 미구현된 추상 메서드를 구현하는 것.
	// 2. 이 타입을 추상 클래스로 바꿀 것.
	double x;
	double y;
	
	public Triangle(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// 부모가 추상 메서드를 선언했으므로 이를 상속받은 자식 클래스에서 이를 구현할 책임이 있다.
	@Override // 오버라이드 어노테이션 (지워도 됨)
	public double area() {
		return x * y / 2;
	}
	
	@Override
	public double circum() {
		// 삼각형 생긴 거 가정이 직각삼각형 모양이었음...
//		return x + Math.sqrt((Math.pow(x / 2, 2) + Math.pow(y, 2))) * 2;
		return x + y + Math.sqrt(x * x + y * y);
	}
}
