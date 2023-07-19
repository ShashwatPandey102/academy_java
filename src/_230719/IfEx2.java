package _230719;

public class IfEx2 {
	public static void main(String[] args) {
		
		int score = 80;
		
		String grade = "";
		
		System.out.println("학점부여 시작");
		
		if(score >= 95) {
			grade = "A+";
		}else if(score >= 90) {
			grade = "A";
		}else if(score >= 85) {
			grade = "B+";
		}else if(score >= 80) {
			grade = "B";
		}else if(score >= 70) {
			grade = "C";
		}else if(score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		// 내부적으로는 아래와 같이 처리하는 것이다.
		if(score >= 90) {
		
		}else {
			if(score >= 80) {
				
			}else {
				
			}
		}
		
		System.out.printf("당신의 학점은 %s입니다\n", grade);
		
		System.out.println("학점 부여 끝");
		
	}
}





