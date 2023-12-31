package _230718;

public class CastingEx4 {
	public static void main(String[] args) {
//		int num = 300; // 4바이트 정수
		int num = 200; // 4바이트 정수
//		128 64 8
//		11001000[2] -> -56

//		11001000[2] -> -56인 이유 알아보기
//		위 숫자는 2의 보수로 표현된 상태이므로 저기서 다시 1을 빼고 1과 0을 바꾼다
//		11000111 (1을 뺀 상태)
//		00111000 (0과 1을 바꾼 상태)
//		8 + 16 + 32 = 56
//		즉, 양수 56을 2의 보수로 바꾼 형태가 11001000이므로 이 값이 -56이 된다.
		
		byte b = (byte) num; // 1바이트 정수 -> 200인 경우 -56으로 바뀜
//		형변환 : 표현 가능한 비트수를 변경하는 것
		System.out.println(Integer.toBinaryString(-56));
		
		System.out.println(num);
		System.out.println(b);
		
		// 2진법
		// 300을 2진법으로 : 100101100
		
		int value = 0b100101100; // 앞에 0b 붙이면 뒤의 값을 2진수로 인식함
		
		// 여기서 1바이트 정수로 바꾸면 작은 자리수부터 8자리만을 가지게 되므로 맨 앞의 1이 빠져서 (256이 빠짐)
		// 결과적으로 44가 된다
		
//		10진법
//		4567
//		4000 + 500 + 60 + 7
//		4 * 10^3 + 5 * 10^2 + 6 * 10^1 + 7 * 10^0
		
//		1001[2]
//		1 * 2^3 + 1 * 2^0
		
//		10진수 50을 2진수로 변환
//		110010[2]
		
//		1바이트 = 8비트
//		00000000 ~ 11111111
		
//		1바이트 : 문자를 표현하기 위한 최소 단위
//		1비트 : 정보를 표현하기 위한 최소 단위
		
//		최초의 비트 : 부호 bit (sign bit)
//		0 0000000 // 0일 때 양수, 1일 때 음수 (부호 절대값)
//		1 0000100 = -4
//		0 0000100 = 4
		
//		2의 보수
//		10진수 -5를 8비트 2의 보수 형태로
//		00000101 
//		10000101 (부호 절대값)
//		이것을 2의 보수로 만들어야 함
//		0과 1을 서로 바꾸고 거기에 1을 더한다
//		11111010 (1의 보수)
//		11111011 (2의 보수)
		
//		0 000	0
//		0 001	1
//		0 010	2
//		0 011	3
//		0 100	4
//		0 101	5
//		0 110	6
//		0 111	7
//		1 000	-0 -8 (2의 보수) (000 -> 111 -> 1000)
//		1 001	-1 -7
//		1 010   -2 -6
//		1 011   -3 -5
//		1 100   -4 -4
//		1 101   -5 -3
//		1 110   -6 -2
//		1 111   -7 -1
		
//		7 - 5
//		7 + (-5)
		
//		0000 0111 + 1111 1011 (2의 보수)
		
//		  0000 0111
//		  1111 1011
//		-----------
//		1 0000 0010 (맨 앞의 자리올림수는 사라짐)
//		7 + (-5) = 2
		
//		0 111 1111 (127, 8비트 최대값) -> 0도 양수로 생각하기 때문임
//		1 000 0000 (-128, 8비트 최소값)
//		1 111 1111 (-1)
		
//		어느 정도 개념을 외울 것
		
		System.out.println(value);
		
		System.out.println(Integer.toBinaryString(-1)); // 십진수 값을 바이너리 문자열로 변환
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(Integer.toBinaryString(1)); // 앞의 0은 지워짐
		
		// 자바에서는 부동소수점 방식을 사용함 (floating point)
		
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		
		// 2진수로 계산되기 때문에 max + 1은 오버플로우가 나서 min값이 나오고, min - 1은 오버플로우는 아니고 보수 계산상 max값이 나온다
		System.out.println(max + 1);
		System.out.println(min - 1);
		
		double a2 = 3.141562;
		int b2 = (int) a2;
		System.out.println(b2);
		
		// char, short간 자동(묵시적) 형변환은 안 된다
		
		// char는 0 ~ 65,535
		// short는 -32,768 ~ 32,767
		
		// 변수 범위가 겹치지 않는 부분이 있어서 안 됨
		char c = 'A';
		short sh = (short) c;
		System.out.println(sh);
		
		// 또한 long, float간 형변환도 주의해야 한다
		
//		long l = 3f; // long이 더 큼에도 불구하고 (long이 8바이트, float이 4바이트)
		float f = 3L; // 오히려 작은 float에 큰 long을 담았을 때 자동 형변환이 가능하다.
		
//		이는 바이트 크기대로 순서가 아닌
//		byte < short < int < long < float < double 순서가 되기 때문이다 (무조건 실수 자료형이 정수 자료형보다 크다)
//		다만 char는 기본 자료형끼리 상호 자동 형변환이 되지 않는다
		
		int x = 1;
		x = x + 1;
		int y = 0;
		y = x = 10; // 이렇게 대입 연산자를 여러 개 써도 됨 (가장 오른쪽에서 왼쪽으로 연산한다)
		
		System.out.println(y);
		System.out.println(x);
	}
}











