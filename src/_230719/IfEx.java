package _230719;

public class IfEx {
	public static void main(String[] args) {
		
		int score = 70;
		
		System.out.println("시험 시작");
		
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// 블럭이 없는 조건식을 사용했을 경우 조건식 바로 다음 줄만 실행한다.
		
		System.out.println("시험 끝");
	}
	
}


