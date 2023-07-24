package _230724;

import java.util.ArrayList;
import java.util.List;

public class CarMain2 {
	public static void main(String[] args) {

		Car[] cars = new Car[3];

		Car tico = new Car();
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";

		for (int i = 0; i < cars.length; i++) {
			cars[i] = tico; // 전부 같은 객체를 저장하였다.
			System.out.println(cars[i].hashCode()); // 같은 주소를 가리킴
		}

		System.out.println("2번 인덱스 color : " + cars[2].color);

		cars[0].color = "블랙"; // 전부 같은 객체(주소)를 참조하므로, 해당 주소의 값을 바꾸면 다른 같은 주소를 참조하고 있는 객체들의 값도 (당연히) 바뀌게 된다.

		System.out.println("2번 인덱스 color : " + cars[2].color);
		System.out.println("0번 인덱스 color : " + cars[0].color);

		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);

		List<Car> carList = new ArrayList<>();
		carList.add(tico);
		carList.add(tico);
		carList.add(tico);
		
		System.out.println(carList.toString());
		
	}
}









