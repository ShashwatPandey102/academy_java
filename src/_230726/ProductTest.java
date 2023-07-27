package _230726;

import java.util.ArrayList;
import java.util.List;

// 약간 장바구니처럼 만드는 예제 (다형성 예제)
// 메서드의 매개변수에 다형성을 이용한 예제

abstract class Product { // 추상 클래스로 선언된 부모 클래스
	int price;

	Product(int price) { // 부모 클래스의 생성자
		this.price = price;
	}
}

class Buyer { // 구매자 클래스

	int money = 1000; // 가지고 있는 돈
	List<String> cart = new ArrayList<>(); // 장바구니

	// 사는 행위 (다형성이 없다고 하면(구상체를 이용하면) 클래스마다 일일이 메서드를 만들어줘야 할 것이다)
//	void buy(Tv tv) {
//		
//	}

	// 부모 클래스의 추상 클래스를 구현해야 함 (매개변수를 부모 클래스로 하였다)
	void buy(Product p) { // 물건 (부모 클래스)을 구매 (다형성을 위해 여기서 부모 클래스를 매개변수로 적용함)
		this.money -= p.price;
		this.cart.add(p.getClass().getSimpleName()); // getClass().getSimpleName() : 해당 클래스 생성 시 생성되는 간단한 이름
	}

	void print() {
		System.out.printf("구매한 상품은 %s, 잔고는 %d원입니다", this.cart.toString(), this.money);
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	Tv(int price) {
		super(price);
	}
}

class Computer extends Product {
	Computer() {
		super(150);
	}
}

class Aircon extends Product {
	Aircon() {
		super(50);
	}
}

class Laptop extends Product {
	Laptop() {
		super(200);
	}
}

public class ProductTest {
	public static void main(String[] args) {

		Buyer buyer = new Buyer();

		buyer.buy(new Tv()); // 매개변수는 부모 클래스인 Product이지만, 실제 인자로는 해당 클래스의 자식 클래스들로 생성한 인스턴스이다.
		buyer.buy(new Computer());
		buyer.buy(new Aircon());
		buyer.buy(new Tv(300));

		buyer.print();
	}
}





