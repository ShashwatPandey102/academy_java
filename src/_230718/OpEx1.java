package _230718;

public class OpEx1 {
	public static void main(String[] args) {
		
		int number1 = 10;
		System.out.println("number1 = 10 -> " + number1);
		
		// +=, -=, *=, /=, %= 는 복합 대입 연산자이다
		number1 += 10;
//		number1 = number1 + 10; // 위와 같음
		System.out.println("number1 += 10 -> " + number1);
		
		number1 -= 10;
		System.out.println("number1 -= 10 -> " + number1);
		
		number1 *= 2;
		System.out.println("number1 *= 2 -> " + number1);
		
		number1 /= 2;
		System.out.println("number1 /= 2 -> " + number1);
		
		number1 %= 3;
		System.out.println("number1 %= 3 -> " + number1);
		
		int num = 10;
//		num = num + 3L; // int와 long을 더하므로 자동으로 long으로 변환되어 연산한다.
		num = (int) (num + 3L);
		// 그럼 long 타입을 int 타입에 담게 되므로 에러가 발생한다. (명시적 형변환 필요)
		
		System.out.println(num);
		
		// 3f + 3L
		// byte short char (int보다 작은 자료형 3가지)
		
		byte b1 = 1;
		byte b2 = 2;
//		byte b3 = b1 + b2; // 이건 자동으로 int로 변환해서 이항 연산을 하므로 문제 있음 (자동으로 상승 형변환을 함)
		byte b3 = (byte) (b1 + b2); // 그래서 이렇게 하거나 해야 함
		byte b4 = 1 + 2; // 이건 문제 없음 (리터럴값끼리 계산하면 컴파일러가 문제가 없다고 판단함)
//		b1 = b1 + 1; // 이것도 안 됨
		b1 += 1; // 하지만 이건 됨
	}
}








