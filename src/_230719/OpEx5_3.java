package _230719;

public class OpEx5_3 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		// && 연산 (0으로 나눌 경우 division by zero 에러가 나기 때문에 앞에서 선행 조건을 줌)
		System.out.println(b > 0 && (a / b > 0));
		
		// 아래와 같이 정수를 0으로 나누면 division by zero 에러가 난다 (제수가 0이면 에러)
//		System.out.println(a / b > 0);
		
//		특수한 경우 정리
		System.out.println(3d / 0); // Infinity (실수를 0으로 나눔)
		System.out.println(0d / 0); // NaN (Not a Number) (실수 0을 0으로 나눔)
		System.out.println(0 / 0); // error (정수 0을 0으로 나눔)
	}
}
