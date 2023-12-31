package shape;

// 다형성이 왜 중요한지 알 수 있는 예제

// 각종 도형의 넓이를 구하는 클래스
public class ShapeTest {
	public static void main(String[] args) {

		// 도형

		// 원, 사각형
		Shape c1 = new Circle(3); // Shape를 부모 클래스로 만들어서 Circle과 Rectangle 객체를 Shape로 선언하여 생성한다.
		Shape r1 = new Rectangle(2, 3); // 컴파일러는 이 객체를 Shape로 인식하나, 실제 인스턴스가 생성되면 자식 클래스인 Rectangle로 생성된다.
		Shape t1 = new Triangle(3, 5);
		
		// 자식 클래스들을 부모 클래스 배열에 모아놓을 수 있다.
		Shape[] shapes = {c1, r1, t1}; // 분명 인스턴스 자료형은 다르나 (각각 Circle, Rectangle) 같은 공통 조상을 가지고 있기에 조상인 Shape 배열로 묶을 수 있다.
		
//		Shape s1 = new Shape(); // Cannot instantiate the type Shape 오류가 뜸 (명시적으로 추상 클래스로 선언했기 때문)
		
		for(Shape shape : shapes) {
			System.out.println(shape);
			System.out.println(shape.area());
		}
		
//		Shape s = new Shape(); // Cannot instantiate the type Shape (추상 클래스인 Shape 클래스를 인스턴스화할 수 없음)
		
//		Circle c = c1; // 이렇게 넣을 순 없음. 인스턴스 자체는 Circle로 만들어졌지만, 선언이 Shape로 선언되었기 때문에, 큰 자료형을 작은 자료형에 넣을 때는 자동 형변환이 되지 않음. 그래서 자동 형변환이 되지 않기 때문에 명시적 형변환을 해야 함
		Circle c = (Circle)c1; // 이렇게 명시적 형변환을 하면 가능함
		System.out.println(c);
		
		// 여기서 다시 시작
		Cube cube = new Cube((Rectangle)r1, 2d);
		System.out.println(cube.area());
		System.out.println(cube.volume());
		
		Triangle t = new Triangle(3, 4);
		System.out.println(t.circum());
		System.out.println(t.area());
		
		Circle c2 = new Circle(3);
		
		// 다형성을 이용해서 상위 클래스인 Shape2D 객체에 하위 클래스를 담을 수 있다.
		Shape2D shape1 = c2; // 하지만 인스턴스는 Circle임
		
		// 더 상위 클래스인 Shape에 담을 수도 있다.
		Shape shape2 = c2; // 하지만 인스턴스는 Circle임
		
		// 비슷하게 Shape2D를 Shape에 담을 수도 있다.
		Shape shape3 = shape1; // 하지만 인스턴스는 Circle임

		// 인스턴스는 Circle이라도 선언을 Shape로 했으므로 컴파일러는 이를 Circle 인스턴스가 아닌 Shape 인스턴스로 생각한다.
	}
}






