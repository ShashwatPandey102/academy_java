package _230731;

public class WrapperEx2 {
	public static void main(String[] args) {
		
		System.out.println("정수의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("정수의 최소값 : " + Integer.MIN_VALUE);
		System.out.println("Byte의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("Byte의 최소값 : " + Byte.MIN_VALUE);
		
		System.out.println("Integer의 사이즈 : " + Integer.SIZE);
		System.out.println("Float의 사이즈 : " + Float.SIZE);
		System.out.println("Double의 사이즈 : " + Double.SIZE);
		
		System.out.println("Float의 최대값 : " + Float.MAX_VALUE);
		System.out.println("Float의 최소값 : " + Float.MIN_VALUE);
		System.out.println("Double의 최대값 : " + Double.MAX_VALUE);
		System.out.println("Double의 최소값 : " + Double.MIN_VALUE);
		
		// 아래와 같이 변환할 수 있다.
		// 1. 문자열 >> Integer
		Integer int3 = new Integer("1234");
		
		// 2. 문자열 >> int
		int i1 = Integer.parseInt("1234");
		
		// 3. int >> Integer // auto boxing
		Integer int1 = new Integer(1234);
		
		// 4. int >> 문자열 // + ""
		String str = String.valueOf(1234);
		String str4 = 1234 + "";
		
		// 5. Integer >> int // auto unboxing
		Integer int2 = new Integer(1234);
		int i2 = int2.intValue();
		
		// 6. Integer >> 문자열 // + ""
		String str2 = int2.toString();
		String str3 = int2 + "";
		
		
		
	}
}




