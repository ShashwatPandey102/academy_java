package _230726;

public class Car2Main {
	public static void main(String[] args) {
		
		Car2 c1 = new Car2();
		Car2 c2 = new Car2("중형차");
		Car2 c3 = new Car2("현대", "대형차");
		Car2 c4 = new Car2("black", "기아", "화물차");
		
		System.out.println(c1); // 이렇게 하면 컴파일러가 자동으로 내부적으로 c1.toString() 을 호출하여 변환해준다
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
