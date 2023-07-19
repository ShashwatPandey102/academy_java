package _230718;

public class OpEx4 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		boolean c = a == b;
		System.out.println("c = " + c);
		boolean d = c == false; // d에 true가 들어감
		System.out.println("d = " + d);
		
//		산술, 비교(대소, 동치), 논리
//		산술 : 피연산자 : 숫자, 계산결과 : 숫자
//		비교(대소) : 피연산자 : 숫자, 계산결과 : 논리
//		비교(동치) : 피연산자 : 제한없음, 계산결과 : 논리
//		논리 : 피연산자 : 논린, 계산결과 : 논리
		
//		AND, OR, NOT (XOR은 잘 안 씀)
//		AND : 교집합 (둘다 참일 때만 참)
//		A && B
		
//		&와 && 둘 다 가능하나 &는 앞이 거짓이어도 뒤의 판별식을 실행하고, &&는 앞이 거짓이면 뒤의 판별식을 실행하지 않는다.
		
//		OR : 합집합 (둘 중 하나만 참이어도 참)
//		A || B
		
//		NOT : 여집합
//		boolean A = true;
//		!A -> false
//		!!A -> true
	}
}






