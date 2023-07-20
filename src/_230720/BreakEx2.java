package _230720;

public class BreakEx2 {
	public static void main(String[] args) {
		
		// 중첩 반복문을 사용했을 때 특정 반복문을 탈출하는 방법
		// 또는 boolean값을 사용하여 그냥 해당 반복문에서 break 하여 탈출하는 방법도 있다.
		ifor:for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 3) {
					break ifor;
				}
				System.out.printf("i = %d, j = %d\n", i, j);
			}
		}
	}
}
