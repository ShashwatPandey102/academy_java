package _230718;

// + : plus
// - : 하이픈
// * : 별, asterisk, wild card
// / : slash

// [] : 대괄호
// {} : 중괄호 (block)
// () : 소괄호

public class ScopeEx { // 클래스 블럭
	int no; // 클래스 블록 바로 아래 - 전역변수 (global variable)
	
	public static void main(String[] args) {
		String name = "홍길동"; // 지역변수 (local variable)
		
		System.out.println(name);
		
		// 아래와 같이 그냥 중괄호 작성해도 됨
		{
			int num = 10;
			System.out.println(num);
			System.out.println(name);
		}
		
		// 아래의 코드는 작동하지 않음 (num은 하위 블록 내에서 선언했기 때문)
//		System.out.println(num); // cannot be resolved to a variable
		
		// 변수 선언 위치가 중요함
		
		double d = 10.5;
		System.out.println("d = " + d); // 문자열로 자동 형변환
//		String str = "d = " + d; // 내부적으로 왼쪽과 같은 연산이 일어남
		
		d = 10L;
		
		System.out.println(d);
		
		int i = 'A'; // 자동 형변환 (아스키 코드)
		System.out.println(i);
		
		// 작은 데이터를 큰 데이터 타입에 담으면 문제가 없지만
		// 큰 데이터를 별다른 형변환 없이 작은 데이터 타입에 담으면 문제가 생긴다
		
		char ch = (char)i;
		System.out.println(ch);
	}
}










