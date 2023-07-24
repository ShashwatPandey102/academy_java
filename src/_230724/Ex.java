package _230724;

public class Ex {
	
	// 연습문제 풀이
	
	public static void main(String[] args) {
		
//		4-2
//		1 ~ 20 정수에서 2 또는 3의 배수가 아닌 수의 총합
//		
//		int sum = 0;
//		
//		for (int i = 1; i <= 20; i++) {
//			if(i % 2 != 0 && i % 3 != 0) {
//				sum += i;
//			}
//		}
//		
//		System.out.println(sum);
		
//		4-3
//		int sum = 0;
//		int sum2 = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//			
//			sum2 += sum;
//			
//			System.out.println(i + ", " + sum + ", " + sum2);
//		}
		
//		4-4
		
//		아래와 같이 조건식을 비워놔도 무한루프가 된다
//		for (int i = 0; ; i++) {
//			
//		}
		
//		int sum = 0;
//		int i = 0;
//		for (i = 1; ; i++) {
//			
//			
//			if(i % 2 != 0) {
//				sum += i;
//			}else {
//				sum -= i; // sum += -i;
//			}
//			
////			System.out.println(i + ", " + sum);
//			
//			if(sum >= 100) {
//				break;
//			}
//		}
//		
//		System.out.println(i);
		
//		4-8
//		for (int x = 0; x <= 10; x++) {
//			for (int y = 0; y <= 10; y++) {
//				if(2 * x + 4 * y == 10) {
//					System.out.println("x = " + x + ", y = " + y);
//				}
//			}
//		}
		
//		4-9
		// '0' : 48
		// 'A' : 65
		// 'a' : 97
//		char ch = "0".charAt(0);
//		System.out.println((int)ch);
//		
//		System.out.println('1' + '2'); // 기본자료형끼리 연산하면 자동으로 int형으로 변경되어 연산된다.
//		System.out.println("1" + "2");
//		
//		String str = "12345";
//		int sum = 0;
//		
//		for (int i = 0; i < str.length(); i++) {
//			sum += str.charAt(i) - '0';
//		}
//		
//		System.out.println(sum);
		
//		4-10
//		int num = 12345;
//		int sum = 0;
//
//		while(num > 0) {
//			sum += num % 10; // num값에서 10을 나눠서 쓴다.
//			num /= 10;
//		}
//		
//		System.out.println(sum);
		
//		4-11
		// 스킵
		
//		4-15
		// 회문수
		int number = 12322;
		int temp = number;
		int result = 0;
		
		while(temp > 0) {
			result = result * 10 + temp % 10;
			temp /= 10;
		}
		
//		5-4
		// 스킵
		
//		5-5
		// 스킵
		
//		5-6
		// 스킵
		
//		5-11
		// 스킵
		
	}
}
















