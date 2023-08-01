package homework;

import java.util.Calendar;

import lombok.Data;

@Data
public class Cal {
	private int year;
	private int month;
	
	// 처음 실행했을 경우
	public Cal() {
		Calendar calendar = Calendar.getInstance(); // 일단 오늘 날짜 가져옴
		
		// 오늘 연월로 설정
		this.year = calendar.get(Calendar.YEAR);
		this.month = calendar.get(Calendar.MONTH) + 1;
	}

	// 달력 보여주기
	public void view() {
		System.out.println(String.format("============== %d.%d ==============", this.year, this.month));
		
		
		
		System.out.println("====================================");
		System.out.println("<-이전\t\t\t\t다음->");
	}
}
