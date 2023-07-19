package _230718;

public class CastingEx2 {
	
	public static void main(String[] args) {
		double pi = 3.14;
		
		int pi2 = (int) pi; // 강제 형변환
		
		System.out.println(pi);
		System.out.println(pi2); // 값의 손실 발생
	}

}
