package _230731;

public class StringBuilderSpeedTest {
	public static void main(String[] args) {
		
		Long start = System.currentTimeMillis();
		
		String s = "";
		
		StringBuilder sb = new StringBuilder(s);
		
		for (int i = 0; i < 100_000_000; i++) {
			sb.append("1");
		}
		
		Long end = System.currentTimeMillis();
		
		System.out.println(sb.length());
		s = sb.toString();
		
		System.out.println(end - start + "ms"); // 대략 850ms
		
	}
}
