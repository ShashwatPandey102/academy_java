package _230720;

public class ControlPractice {
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i <= 100; i += 5) {
			sum += i;
		}
		
		System.out.println("5의 배수의 합계는 : " + sum);
		
		System.out.println("============================");
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}else {
				oddSum += i;
			}
		}
		
		System.out.println("짝수의 합계는 : " + evenSum);
		System.out.println("홀수의 합계는 : " + oddSum);

		System.out.println("============================");
		
		// 두 눈의 합이 6이 되는 모든 경우
		int eyeSum = 6;
		
		for (int i = 1; i <= eyeSum; i++) {
			for (int j = 1; j <= eyeSum; j++) {
				if(i + j == eyeSum) {
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}

		System.out.println("============================");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

		System.out.println("============================");

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}

		System.out.println("============================");


		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}

		System.out.println("============================");
		
		// 주사위 눈이 6이 나올 때까지 반복해서 굴리고, 눈이 6이 되면 지금까지 주사위를 굴린 횟수까지 출력
		// while문으로 반복, 주사위는 Math.random()으로 작성
		
		int count = 0;
		
		while(true) {
			int rand = (int)(Math.random() * 6) + 1;
			
			count++;
			
			System.out.printf("%d\n", rand);
			
			if(rand == 6) {
				System.out.printf("총 주사위 굴린 횟수는 : %d회", count);
				break;
			}
			
			
		}
	
	}
}









