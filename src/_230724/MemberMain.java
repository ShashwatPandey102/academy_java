package _230724;

public class MemberMain {
	public static void main(String[] args) {

		Member member = new Member();
		Member member2 = new Member();
		
		System.out.println(member);
		System.out.println(member2);
		
		if(member == member2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		// 서로 독립된 개체이다.
		MemberMain mm = new MemberMain();
		MemberMain mm2 = new MemberMain();
		
		if(mm == mm2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}
}
