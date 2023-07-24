package _230721;

public class P4_10 {
	public static void main(String[] args) {
		
		int num = 12345;
		int sum = 0;
		
		// 문자열로 변환하지 않고 숫자로만 해야 함
		
		int i = 1; // 10^1부터 나눈다. 10^i가 num보다 크면 중단한다.
		int div, rem;
		
		while(true) {
			div = (int)Math.pow(10, i);

			// 나눈 나머지를 더하고 그걸 원래 숫자에서 빼고 쭉 진행하면 될 듯
			
			rem = num % div;
			
			sum += rem / (int)Math.pow(10, i - 1);
			num -= rem;
			
			i++;
			
			if(div > num) {
				break;
			}
		}
		
		System.out.println("sum = " + sum);
	}
}
