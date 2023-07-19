package _230718;

public class OpEx3 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		++a; // 전위연산
		b++; // 후위연산
		
		System.out.println(a);
		System.out.println(b);
		
		a = 10;
		b = ++a;
		System.out.println("전위 연산 결과 : " + b);
		
		int x = 10;
		int y = x++;
		System.out.println("후위 연산 결과 : " + y); // x를 y에 먼저 대입 후 증가시킴
		System.out.println("x : " + x);

		a = 10;
		a++;
		System.out.println("a++ : " + a);
		b = 10;
		b += 1;
		System.out.println("b += 1 : " + b);
		int c = 10;
		c = c + 1;
		System.out.println("c = c + 1 : " + c);
		
		if(false == false) {
			System.out.println("test");
		}
		
		// 각 연산에 대해
		// 산술, 비교(대소, 동치), 논리
		
		// 산술 : 피연산자 타입은 boolean을 제외한 기본형 데이터, 계산 결과 역시 boolean을 제외한 기본형 데이터
		// 비교 : 모든 기본형 데이터, 계산 결과는 논리형 데이터(true, false)
		
	}
}







