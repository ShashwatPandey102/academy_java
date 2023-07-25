package _230725;

public class InitEx {
	InitEx(){
		System.out.println("생성자 호출");
	}
	
	// 클래스 초기화 블럭
	static {
		System.out.println("클래스 초기화 블럭 실행");
	}
	
	// 인스턴스 초기화 블럭
	{
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main 메서드 시작");
		System.out.println("main init1 객체 생성 시작");
		InitEx ie1 = new InitEx();
		System.out.println("main init2 객체 생성 시작");
		InitEx ie2 = new InitEx();
		
	}
	
	// 자바 소스가 실행되면 JVM이 먼저 클래스 초기화 블럭이 가장 먼저 실행된다. (클래스 변수, 클래스 메서드부터 스태틱 영역에 올라감)
	// 그 후 main 메서드가 시작되며, 각 객체가 new 키워드에 의해 생성되면 각 클래스의 인스턴스 초기화 블럭이 실행된다. 그 후 각 인스턴스의 생성자가 호출된다. 그 후 나머지 부분이 실행된다.
	
	// 행위					시점				자원반납
	// 클래스 초기화		클래스 로드 시		프로그램 종료 시
	// 인스턴스 초기화		인스턴스 생성		가비지 컬렉션(GC)이 주기적으로
}








