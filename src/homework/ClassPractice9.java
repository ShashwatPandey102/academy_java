package homework;

// 싱글톤
public class ClassPractice9 {
	public static void main(String[] args) {
		Exercise ex1 = Exercise.getInstance();
		Exercise ex2 = Exercise.getInstance();
	
		System.out.println("ex1 == ex2 : " + (ex1 == ex2));
	}
}

class Exercise{
	
	private static Exercise exercise = new Exercise(); // 로드 시 한 번만 생성함
	
	// 기본 생성자 외부에서 호출 금지
	private Exercise() {
		
	}
	
	public static Exercise getInstance() {
		return exercise;
	}
}