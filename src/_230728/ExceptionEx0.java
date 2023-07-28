package _230728;

public class ExceptionEx0 {
	public static void main(String[] args) {

		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3 / 0); // division by zero
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		} catch (Exception e) { // 매개변수의 다형성 (ArithmeticException을 던졌을 때, 부모 클래스인 Exception 매개변수를 지정함으로써 해당 부모
								// 클래스의 하위 클래스 타입을 지정해도 매개변수를 받을 수 있다)
			System.out.println(5);
		}
		System.out.println(6);
	}
}
