package _230719;

public class IfEx3 {
	public static void main(String[] args) {
		
		int math = 90;
		int eng = 55;
		
		if(math >= 60) {
			if(eng >= 60) {
				System.out.println("통과");
			}
		}else {
			System.out.println("탈락");
		}
	}
}
