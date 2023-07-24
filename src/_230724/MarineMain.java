package _230724;

public class MarineMain {
	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		
		System.out.println(m1);
		
		Marine m2 = new Marine();
		System.out.println(m2);
		
		System.out.println("m1이 20의 피해 입음");
		
		m1.nowHp -= 20;
		
		System.out.println(m1);
		System.out.println(m2);

		System.out.println("Marine의 공격력 업그레이드");
		Marine.att = 2;

		System.out.println(m1);
		System.out.println(m2);
	}
}
