package _230720;

public class ContinueEx {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i != 5) {
				continue; // 현재 반복문의 다음 loop로 넘어간다
			}
			
			System.out.println(i);
		}
	}
}
