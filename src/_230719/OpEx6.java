package _230719;

public class OpEx6 {
	public static void main(String[] args) {
		
		System.out.println("2 : " + Integer.toBinaryString(2)); // 2를 2진수로
		System.out.println("3 : " + Integer.toBinaryString(3)); // 3를 2진수로
		
		// 각종 비트 논리연산 적용
		
		System.out.println("2 & 3 : " + Integer.toBinaryString(2 & 3)); // 비트 AND (& 비트곱)
		System.out.println("2 | 3 : " + Integer.toBinaryString(2 | 3)); // 비트 OR (| 비트합)
		System.out.println("2 ^ 3 : " + Integer.toBinaryString(2 ^ 3)); // 비트 XOR (배타적 논리합) -> 두 비트가 다를 때만 1, 같으면 0
		System.out.println("~3 : " + Integer.toBinaryString(~3)); // 비트 NOT
		
		System.out.println("------------------------------------");
		
		// 여기서 ~3의 이진수 값의 길이를 알아보자
		System.out.println("~3의 십진수 값 : " + (~3));
		System.out.println("~3의 이진수 값의 길이 : " + Integer.toBinaryString(~3).length()); // 32가 나옴 (int타입의 크기인 4바이트)

		System.out.println("정수 자료형의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("정수 자료형의 최대값 + 1 : " + (Integer.MAX_VALUE  + 1));
		
//		System.out.println(Integer.parseInt(Integer.toBinaryString(~3), 2) - Integer.MAX_VALUE - 1); // 두 번째 매개변수로 radix (진법)을 받음.
		// radix를 2로 지정하면 2진수를 10진수로 변환하여 출력함
		// 왜 안 되는지 모르겠는데 안 됨
		
		System.out.println("바이트 자료형의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("바이트 자료형의 최대값 + 1 : " + ((byte)(Byte.MAX_VALUE + 1))); // 그냥 연산을 하면 자동으로 int로 타입변환을 한다
	}
}
