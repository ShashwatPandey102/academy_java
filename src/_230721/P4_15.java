package _230721;

public class P4_15 {
	public static void main(String[] args) {
		
		// 회문수 (팰린드롬 수) 구하기
		
		int number = 123412;
		int temp = number;
		
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		
		// 이거 역시 10의 n승을 활용하여 해보자
		// 일단 문자열은 쓰면 안 될 것 같으니 number의 크기를 구하자
		
		int i = 1;
		int div;
		int len = 0;
		while(true) {
			div = (int)Math.pow(10, i);
			
			if(div > number) { // 9999까지는 5자리가 된다고 친다.
				len = i;
				break;
			}
			
			i++;
		}
		
		int rem;
		
		i = 1;
		
		// 거꾸로 해야 하므로 끝수부터 나온 나머지 값을 해서 len - i의 제곱을 해서 더해준다.
		while(temp != 0) {
			div = (int)Math.pow(10, i);
			
			rem = temp % div;
			
			// rem은 순서대로 1, 40, 300, 2000, 10000이 나옴
			// 저걸 10000, 4000, 300, 20, 1 순서대로 더하게 해야 함
			// 1 * 10**4 + 40 * 10**2 + 300 .. 이런 식으로
			result += (int)(rem * Math.pow(10, len - 1 - (2 * (i - 1))));
			
			temp -= rem;
			
			i++;
		}
		
		System.out.println("뒤집은 수 : " + result);
		
		if(number == result) {
			System.out.println(number + "는 회문수입니다");
		}else {
			System.out.println(number + "는 회문수가 아닙니다");
		}
		
		
	}
}






