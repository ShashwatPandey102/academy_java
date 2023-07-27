package shape;

public class Circle implements Shape2D{
	// 반지름
	private double r;
	
	public Circle() {
	}

	// 필드 초기화하는 생성자
	public Circle(double r) {
		this.r = r;
	}

	// 넓이 구하는 메소드
	@Override
	public double area() {
		return Math.PI * Math.pow(r, 2);
	}
	
	@Override
	public double circum() {
		return Math.PI * 2 * r;
	}
}
