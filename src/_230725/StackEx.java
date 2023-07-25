package _230725;

public class StackEx {
	public static void main(String[] args) {
		System.out.println("main 시작");
		m1("메인호출");
		System.out.println("main 끝");
	}
	
	static void m1(String str) { // static 키워드가 붙었으므로 스태틱 영역에 올라감
		System.out.println("m1() 시작");
		System.out.println(str);
		System.out.println(m2(0));
		System.out.println(m2(1));
		System.out.println("m1() 끝");
	}
	
	static String m2(int i) { // static 키워드가 붙었으므로 스태틱 영역에 올라감
		System.out.println("m2() 시작");
		if(i == 1) {
			return "메세지";
		}
		
		System.out.println(i);
		System.out.println("m2() 끝");
		return "message";
	}
}

// 프로그램이 시작되면 JVM이 main 메소드를 찾아서 실행함. 당연히 main 메소드도 스택 영역 가장 바닥에 깔린다. 각 메소드가 메소드 영역(스태틱 영역)에 올라간다.
// m1을 호출하면 스택 영역에 스택 프레임으로서 메인 메서드와 그 지역변수가 들어간다. m1 내에서 m2를 호출한다.







