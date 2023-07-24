package _230721;

public class ArrEx16 {
	public static void main(String[] args) {
		
		int[] arrInt = {1, 2, 3, 4, 5};
		
		for(int i : arrInt) {
			System.out.printf("%d ", i);
		}
		
		String[][] lunches = {{"짬뽕", "짜장", "볶음밥"}, {"부대찌개", "김치찌개"}, {"파스타"}};
		
		System.out.println();
		
		for(String[] lunches2 : lunches) {
			for(String lunch : lunches2) {
				System.out.printf("%s ", lunch);
			}
			
			System.out.println();
		}
	}
}
