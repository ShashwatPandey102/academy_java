package _230801;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DecimalFormatEx {
	public static void main(String[] args) throws Exception {

		DecimalFormat df1 = new DecimalFormat("###,###.##"); // #은 없는 부분은 안 채우고
		DecimalFormat df2 = new DecimalFormat("000,000.00"); // 0은 없는 부분이라도 채운다

		System.out.println(df1.format(5500));
		System.out.println(df2.format(5500));

		// 근데 보통 DecimalFormat까지도 잘 안 쓰고 그냥 String.format을 사용함
		System.out.println(String.format("%.2f", 1234.56789));

//		System.out.println(new Date());
//		System.out.println(new GregorianCalendar());
		
		// SimpleDateFormat 클래스는 yy/mm/dd HH:mm:ss 같이 날짜 자료형을 포맷화하거나 한다.
		
		// 문자를 날짜로 바꾸거나 날짜를 문자로 바꿀 때 사용함
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		
		System.out.println(sdf.format(d)); // Date 객체를 이용해 포맷화함
		System.out.println(sdf.format(c.getTime())); // Calendar 객체를 이용해 포맷화함 (중간에 Date로 변환)
		
		String str = "2000-02-02 13:24:35";
		
		Date d2 = sdf.parse(str); // pase
		System.out.println(d2);
	}
}



















