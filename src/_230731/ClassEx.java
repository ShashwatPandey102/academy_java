package _230731;

public class ClassEx {
	public static void main(String[] args) throws Exception {

		ClassEx classEx = new ClassEx();

		// Class 클래스의 인스턴스를 취득하는 3가지 방법

		// 1. 객체를 통한 취득
		Class c1 = classEx.getClass();
		System.out.println(c1);

		// 2. 이름을 통한 취득
		Class c2 = Class.forName("_230731.ClassEx"); // 반드시 상위 패키지명도 적어줘야 함
		System.out.println(c2);

		// 3. 클래스 리터럴을 통한 취득
		Class c3 = ClassEx.class; // 이 방법이 가장 쉽고 가장 많이 쓴다.
		System.out.println(c3);

		// 위에서는 ClassEx로 Class 객체를 생성했지만, 반대로 Class로 ClassEx를 만들 수도 있다고 함.

		Object o = c1.newInstance(); // Class에 ClassEx 인스턴스를 만들어 넣었는데, 이 객체로 새로운 ClassEx 인스턴스를 만들 수도 있음
		System.out.println(o);

		String s = "1";
		// 참조자료형

		// 두 수의 합을 구하는 메서드를 정의한다고 치면,
		System.out.println(sum(1, 2));
		
		// 문자열의 경우 이런 식이 가능하다.
		System.out.println(s.concat("2"));
		
		// 참조자료형은 멤버를 가질 수 있으므로 위와 같은 사용이 가능함
		// 즉, 메서드 체인 방식으로 프로그래밍이 가능함.
		
	}

	static int sum(int x, int y) {
		return x + y;
	}
}













