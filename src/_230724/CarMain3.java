package _230724;

public class CarMain3 {
	public static void main(String[] args) {
		
		Car[] cars = new Car[3];
		
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car(); // 인스턴스 객체
			cars[i].color = "화이트";
			cars[i].company = "대우";
			cars[i].type = "경차";
		}

		for(Car car : cars) {
			System.out.println(car.color);
//			System.out.println(car.company);
//			System.out.println(car.type);
		}
		
		cars[0].color = "블랙";

		for(Car car : cars) {
			System.out.println(car.color);
//			System.out.println(car.company);
//			System.out.println(car.type);
			
			System.out.println(car.hashCode());
		}
		
		// 이건 별도로 각 인덱스마다 new Car()를 했기 때문에, 각자 다른 객체를 가리키고 있다. 그러므로 다른 객체에 영향을 주지 않는다.
		
	}
}
