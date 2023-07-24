package _230721;

public class ArrEx13 {
	public static void main(String[] args) {
		
		int[] arrInt = {1, 2, 3};
		int[] arrInt2 = new int[5];
		
		for (int i = 0; i < arrInt.length; i++) {
			arrInt2[i] = arrInt[i];
		}
		
		for (int i = 0; i < arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
		
		
	}
}
