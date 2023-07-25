package _230725;

public class InitEx2 {
	
	static int print(int i) {
		System.out.println("print() 호출됨 : " + i);
		return 1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Init.si);
		
		new Init();
	}
}

class Init{
	
	// 클래스 변수
	static int si = InitEx2.print(1); // 클래스 변수에 대한 초기화 및 대입이 먼저 진행됨
	static int si2 = InitEx2.print(2);
	
	// 클래스 초기화 블록이 있더라도 해당 클래스를 로드하지 않으면 클래스 초기화 블록이 실행되지 않음.
	static {
		System.out.println("Init 클래스 초기화");
	}
	
	// 인스턴스 초기화 블록
	{
		System.out.println("Init 인스턴스 초기화");
	}
}
