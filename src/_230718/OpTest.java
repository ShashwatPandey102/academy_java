package _230718;

public class OpTest {
	public static void main(String[] args) {
		
		// 1. java 내의 한글의 갯수를 구하시오
		// 한글은 보통 유니코드로 표현된다
		char c = '가';
		char c2 = '힣';

//		for (int i = c; i <= c2; i++) {
//			System.out.print((char)i);
//		}
		
		System.out.println("java에서 표현 가능한 완성형 한글의 개수는 " + (c2 - c + 1) + "개입니다");
		
		// 2. 변수 ch의 값이 영소문자인지 아닌지를 구분하는 코드를 작성하시오
		char ch = 'A';
		
		if(ch >= 97 && ch <= 122) {
			System.out.println("소문자입니다");
		}else {
			System.out.println("소문자가 아닙니다");
		}
		
//		c = '\u0000'; // 여기서 \ (역슬래시)는 이스케이프 문자로, 역슬래시 u는 유니코드를 의미한다
		
		c = '\uAC00'; // AC00은 10진수로 변환하면 44032가 됨
		System.out.println(c);
		
		c2 = 44032;
		System.out.println(c2);
		
		char c3 = 0xAC00; // 0x로 시작하여 16진수를 표현할 수 있다 (0으로 시작하면 8진수)
		System.out.println(c3);
		
		if(c == c2) {
			System.out.println("c와 c2는 같다");
		}
		
		if(c2 == c3) {
			System.out.println("c2와 c3는 같다");
		}
		
		if(c == c3) {
			System.out.println("c와 c3는 같다");
		}
		
		// 16진법 (2^4진법)
		// 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
		// FF (1바이트 최대 개수)
		// 1111 1111
		
		// EA 
		// 1110 1010
		
		// 색상 하나 표현 = 3바이트 (24비트) RGB가 각각 한 바이트씩 차지하기 때문
		// PNG는 rgba에서 alpha (투명도)가 들어가기에 4바이트를 사용한다
	}
}






