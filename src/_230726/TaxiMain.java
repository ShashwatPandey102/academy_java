package _230726;

public class TaxiMain {
	public static void main(String[] args) {

		Taxi t = new Taxi();

		t.go();
	}
}

class Car {

	String color;
	String name;

	public void go() {
		System.out.println("전진");
	}

	public void back() {
		System.out.println("후진");
	}
}

class Taxi extends Car {

	public void go() { // 부모 클래스인 Car의 go() 메서드를 오버라이딩
		System.out.println("미터기를 켜고 전진");
	}
}
