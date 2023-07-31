package _230731;

public class StringBufferSpeedTest {
	public static void main(String[] args) {
		
		Long start = System.currentTimeMillis();
		
		String s = "";
		
		StringBuffer sb = new StringBuffer(s);
		
		for (int i = 0; i < 100_000_000; i++) {
			sb.append("1");
		}
		
		Long end = System.currentTimeMillis();
		
		System.out.println(sb.length());
		s = sb.toString();
		
		System.out.println(end - start + "ms"); // 대략 2640ms
		
	}
}
