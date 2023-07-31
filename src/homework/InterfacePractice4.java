package homework;

public class InterfacePractice4 {
	public static void main(String[] args) {
		
		Tv p1 = new Tv() { // 인터페이스로 익명 구현 객체 생성
			
			@Override
			public void turnOn() {
				System.out.println("TV를 켭니다.");
			}
		};
		
		p1.turnOn();
	}
}

interface Tv{
	void turnOn();
}
