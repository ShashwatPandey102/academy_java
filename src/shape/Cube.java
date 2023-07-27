package shape;

public class Cube implements Shape3D{

	private Rectangle rectangle; // 사각형 객체
	private double z; // z축
	
	// 기본 생성자
	public Cube() {
	}
	
	// 생성자를 여러 개 만듦으로써 호출해서 사용하는 입장에서 골라서 생성할 수 있게 함
	// 사용자 정의 생성자
	public Cube(Rectangle r, double z) {
		this.rectangle = r;
		this.z = z;
	}
	
	// 사용자 정의 생성자 2
	public Cube(double x, double y, double z) {
		// 기존 생성자를 사용하는 방법
		this(new Rectangle(x, y), z); 
		
		// 따로 설정하는 방법
//		this.rectangle = new Rectangle(x, y);
//		this.z = z;
	}
	
	// 겉넓이 공식 : 사각형 넓이 * 2 + 사각형 둘레 * 높이
	public double area() {
		return rectangle.area() * 2 + rectangle.circum() * z;
	}
	
	// 부피
	public double volume() {
		return rectangle.area() * z;
	}
}






