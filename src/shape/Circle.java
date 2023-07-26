package shape;

public class Circle extends Shape {
	// 반지름
	double r;

	// 필드 초기화하는 생성자
	public Circle(double r) {
		this.r = r;
	}

	// 넓이 구하는 메소드
	double area() {
		return Math.PI * Math.pow(r, 2);
	}
}
