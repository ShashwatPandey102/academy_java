package _230727;

// 인터페이스 사용 예시
// 파일 하나에서 하겠다.
public class ComplexerMain {
	public static void main(String[] args) {
		Complexer com = new Complexer(); // 복합기 객체 생성
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);

		// 구현한 메서드들 호출
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
	}
}

// 프린터
interface Printer {
	int INK = 100; // 상수이므로 변수명을 대문자로 한다

	void print(); // 추상 메서드 (출력 기능)
}

// 스캐너
interface Scanner {
	void scan(); // 추상 메서드 (스캔 기능)
	void print(); // 이름이 겹쳐도 어차피 구현부가 없으므로 다중 구현이 가능한 것임.
}

// 팩스
interface Fax {
	String FAX_NUMBER = "02-1234-5678"; // 상수 (현재 복합기의 팩스 번호)

	void send(String tel); // 추상 메서드 (전송 기능)

	void receive(String tel); // 추상 메서드 (수신 기능)
}

// 복합기
class Complexer implements Printer, Scanner, Fax { // 인터페이스 다중 구현

	// 인터페이스를 구현해야 하므로 각 추상 메서드를 구현한다
	// 구현할 추상메서드 중 하나라도 구현하지 않으면 이 클래스도 추상 클래스가 되어야 한다.

	@Override
	public void send(String tel) {
		System.out.println(FAX_NUMBER + "에서 " + tel + "로 FAX 전송");
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel + "에서 " + FAX_NUMBER + "로 FAX 수신");
	}

	@Override
	public void scan() {
		System.out.println("스캔 실행");
	}

	@Override
	public void print() {
		System.out.println("출력 실행");
	}

}

// 인터페이스가 인터페이스 상속
interface Complexer2 extends Printer, Scanner, Fax {

}

// 인터페이스를 일부 구현하는 추상 클래스 (하나도 구현 안해도 됨)
abstract class Complexer3 implements Printer, Scanner, Fax {

}






