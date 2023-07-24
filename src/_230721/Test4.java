package _230721;

public class Test4 {
	public static void main(String[] args) {
		
		char num = 0x06;
		System.out.printf("%04x", num << 2);
		
		StringBuffer sb = new StringBuffer();
		sb.append("KOREA");
		sb.insert(3, "HRD");
		System.out.print(sb.toString());
	}
}
