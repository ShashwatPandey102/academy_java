package _230719;

public class OpEx7 {
	public static void main(String[] args) {
		
//		int score = 80;
//		
//		String pass = score >= 60 ? "합격" : "불합격";
//		
//		System.out.println(pass);
		
		int num = -1;
		
		// num의 값을 기준으로 양수, 음수, 0인지
		
		String res = num > 0 ? "양수" : (num == 0 ? "0" : "음수");
		
		System.out.println(res);
	}
}
