package _230721;

public class ArrEx14 {
	public static void main(String[] args) {
		
		// System.arraycopy를 이용한 방법
		
		int[] arrInt = {1, 2, 3};
		
		int[] arrInt2 = new int[5];
		
		// arraycopy의 두 번째 인자는 복사할 array의 출발 인덱스, arraycopy의 네 번째 인자는 복사할 array의 출발 인덱스를 의미한다. 그리고 마지막 인자는 복사할 배열의 길이를 의미한다.
		System.arraycopy(arrInt, 0, arrInt2, 2, arrInt.length);
		
		for (int i = 0; i < arrInt2.length; i++) {
			System.out.printf("%d ", arrInt2[i]); // 0 0 1 2 3이 출력됨
		};
	
	}
}
