package _230731;

public class StringBufferEx {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("abcd");
		System.out.println("문자열 연결 전 sb1 = " + System.identityHashCode(sb1));
		System.out.println(sb1);
		
		sb1.append("efgh");
		System.out.println("문자열 연결 후 sb1 = " + System.identityHashCode(sb1));
		System.out.println(sb1);
		
		// 같은 객체에 이어붙인 것을 볼 수 있다.
		
		String s = "abcd";
		s.concat("efgh"); // c언어와 다르게 concat으로 합쳐도 해당 객체 자체가 바뀌는 것이 아니다. 그래서 새로운 객체를 만들든지, 기존 객체를 사용하든지 해서 담아야 한다.
		
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("abcd");
		sb.append("efgh"); // 메서드 체이닝이 편함
		
		sb.append("efgh").append(12).append(34);
		System.out.println(sb);
		
		sb.delete(0, 2);
		
		System.out.println(sb);
	}
}








