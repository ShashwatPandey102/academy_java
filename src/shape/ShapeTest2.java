package shape;

public class ShapeTest2 {
	public static void main(String[] args) {
		
		Circle circle = new Circle(3);
		Triangle triangle = new Triangle(3, 4);
		Rectangle rectangle = new Rectangle(3, 4);
		Cube cube = new Cube(3, 4, 5);
		Cylinder cylinder = new Cylinder(3, 4);
	
		// 다형성을 이용한 객체 생성
		Shape shape = new Circle(3);
		
		// 그래서 그 다형성을 극대화하여 사용하는 것이 바로 아래의 코드이다.
		Shape[] shapes = new Shape[5];
		
		int i = 0;
		shapes[i++] = circle;
		shapes[i++] = triangle;
		shapes[i++] = rectangle;
		shapes[i++] = cube;
		shapes[i++] = cylinder;
		
		for(Shape s : shapes) {
			System.out.println(s);
//			s.circum(); // 이렇게 그냥 사용하면 Shape 객체로 알기 때문에 안 된다.
//			((Circle)s).circum(); // 이렇게 사용하면 가능함
			
			System.out.println("넓이 : " + s.area());
			
			// 2D 객체인지
			if(s instanceof Shape2D) { // 해당 인스턴스가 Shape2D로 자동형변환이 가능한가 아닌가 (즉, 해당 인터페이스 하위의 객체인가?)
				Shape2D s2d = (Shape2D)s;
				System.out.println("둘레 : " + s2d.circum());
			}else {
				Shape3D s3d = (Shape3D)s;
				System.out.println("부피 : " + s3d.volume());
			}
		}
		
	}
}
