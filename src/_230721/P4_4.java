package _230721;

public class P4_4 {
	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		while(true) {
			if(i % 2 == 1) {
				sum += i;
			}else {
				sum -= i;
			}
			
			if(sum >= 100) {
				System.out.printf("%d까지 더해야 총합이 100 이상이 됨", i);
				break;
			}
			
			i++;
		}
	}
}
