package _230721;

public class P4_9 {
	public static void main(String[] args) {
		
		String str = "12345";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			int a = str.charAt(i);
			sum += a - 48;
		}
		
		System.out.println("sum = " + sum);
	}
}
