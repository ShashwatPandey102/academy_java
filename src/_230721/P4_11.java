package _230721;

public class P4_11 {
	public static void main(String[] args) {
		
		// 피보나치 수열의 10번째 수는 무엇인지 구하기
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print(num1 + ", " + num2);
		
		for (int i = 0; i < 8; i++) { // 8번 반복
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			
			System.out.print(", " + num3);
		}
	}
}
