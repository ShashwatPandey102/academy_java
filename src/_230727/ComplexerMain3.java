package _230727;

// 인터페이스를 구현한 클래스 (인터페이스를 구상화)
class CIClass implements ComplexerInterface{
	
	public CIClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(String tel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receive(String tel) {
		// TODO Auto-generated method stub
		
	}
	
}

public class ComplexerMain3 {
	public static void main(String[] args) {
		
		ComplexerInterface c = new CIClass(); // 나중에 자바 스프링 빈도 이런 기능이 있는 걸로 안다. 
		Fax f = new CIClass();
		
		System.out.println(c);
		System.out.println(f);
		
		c.print();
//		f.print(); // 얘는 실제로는 ComplexerInterface를 구현했는데, Fax로 선언했기 때문이다.
		
		// 익명 구현 객체 : 일회성 객체 생성으로, 별도의 이름이 없는 익명 구현 객체로 객체를 생성한다.
		// 아래는 구현 클래스를 따로 만들지 않고 바로 new 키워드로 객체를 생성함과 동시에 구현부를 작성했으므로, 일종의 익명 구현 객체라고 볼 수 있다.
		ComplexerInterface ci = new ComplexerInterface() { // 익명 클래스 블록을 연다
			// 여기는 클래스 블록 내이므로 변수나 메서드 등이 들어갈 수 있다.
			
			// 여러 인터페이스를 상속받은 인터페이스를 구현해야 하므로 해당 추상 메서드들을 구현한다.
			@Override
			public void send(String tel) {
				System.out.println("여기는 익명 구현 객체의 send()");
			}
			
			@Override
			public void receive(String tel) {
				System.out.println("여기는 익명 구현 객체의 receive()");
			}
			
			@Override
			public void scan() {
				System.out.println("여기는 익명 구현 객체의 scan()");
			}
			
			@Override
			public void print() {
				System.out.println("여기는 익명 구현 객체의 print()");
			}
		};
		
		ci.send("1234");
		ci.receive("5678");
		ci.print();
		ci.scan();
		
		
	}
}
