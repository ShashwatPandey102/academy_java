package homework;

public class ApiPractice4 {
	
	public static void main(String[] args) {
		
		String[] member = {
				"hong,홍길동,30",
				"lee,이순신,40",
				"kim,김유신,50"
		};
		
		int ageSum = 0;
		
		// 이름만 출력되도록 코드 작성
		for(String s : member) {
			String[] info = s.split(",");
			
			System.out.println(info[1]);
			ageSum += Integer.parseInt(info[2]);
		}
		
		// 평균 나이 출력
		
		System.out.println("평균나이 : " + (double)ageSum / member.length);
	}
}
