package _230719;

public class OpEx6_1 {
	public static void main(String[] args) {
		
		// << 연산 (왼쪽 쉬프트 연산)
		System.out.println("3의 이진수 표현 : " + Integer.toBinaryString(3));
		
		System.out.println(3 << 2); // 3을 2만큼 왼쪽으로 쉬프트 이동 (3 * 2^2)
		System.out.println("3 << 2의 이진수 표현 : " + Integer.toBinaryString(3 << 2));

		System.out.println("==============================================");
		
		System.out.println("8의 이진수 표현 : " + Integer.toBinaryString(8));
		
		System.out.println(8 >> 2); // 8을 2만큼 오른쪽으로 쉬프트 이동 (빈자리는 부호 비트로 채움) (8 * 2^-2)
		// 현재 부호 비트에 맞춰서 채워진다는 것
		System.out.println("8 >> 2의 이진수 표현 : " + Integer.toBinaryString(8 >> 2));

		System.out.println("==============================================");
		
		System.out.println(8 >>> 3); // 8을 3만큼 오른쪽으로 쉬프트 이동 (빈자리는 0으로 채움) (8 * 2^-3)
		System.out.println("8 >>> 3의 이진수 표현 : " + Integer.toBinaryString(8 >>> 3));

		System.out.println("==============================================");
		
		System.out.println(-4 >> 1); // 이 경우 빈자리를 기존 부호 비트인 1로 채움
		System.out.println("-4 >> 1의 이진수 표현 : " + Integer.toBinaryString(-4 >> 1));

		System.out.println("==============================================");
		
		System.out.println(-4 >>> 1); // 이 경우 빈자리를 무조건 0으로 채움
		System.out.println("-4 >>> 1의 이진수 표현 : " + Integer.toBinaryString(-4 >>> 1));
		
	}
}
