package _230727;

// 인터페이스 사용 예시
// 파일 하나에서 하겠다.
public class ComplexerMain {
	public static void main(String[] args) {
		Complexer com = new Complexer(); // 복합기 객체 생성
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);

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