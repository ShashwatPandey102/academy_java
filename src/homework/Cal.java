package homework;

import java.util.Calendar;

import lombok.Data;

@Data
public class Cal {
	private Calendar calendar;
	
	// 처음 실행했을 경우
	public Cal() {
		this.calendar = Calendar.getInstance(); // 일단 오늘 날짜 가져옴
		
		// 오늘 연월로 설정
		this.calendar.set(Calendar.DATE, 1);
	}
	
	public void updateCal(boolean next) {
		if(next) { // 다음
			if(this.calendar.get(Calendar.MONTH) >= 11) {
				this.calendar.set(this.calendar.get(Calendar.YEAR) + 1, 0, 1);
			}else {
				this.calendar.set(this.calendar.get(Calendar.YEAR), this.calendar.get(Calendar.MONTH) + 1, 1);
			}
		}else { // 이전
			if(this.calendar.get(Calendar.MONTH) <= 0) {
				this.calendar.set(this.calendar.get(Calendar.YEAR) - 1, 11, 1);
			}else {
				this.calendar.set(this.calendar.get(Calendar.YEAR), this.calendar.get(Calendar.MONTH) - 1, 1);
			}
		}
	}

	// 달력 보여주기
	public void view() {
		System.out.println(String.format("========== %04d.%02d ==========", this.calendar.get(Calendar.YEAR), this.calendar.get(Calendar.MONTH) + 1));
		
		System.out.println(" SUN MON TUE WED THU FRI SAT");
		
		int j = 0; // 7 되면 0으로 감
		int week = 0; // 고정시켜 보여주기 위한 주의 수
		
		for (int i = 0; i < this.calendar.get(Calendar.DAY_OF_WEEK) - 1; i++) {
			System.out.printf("    ");
			j++;
		}
		
		for (int i = 1; i <= this.calendar.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf(String.format("%4d", i));
			j++;
			if(j >= 7) {
				System.out.println();
				j = 0;
				week++;
			}
		}
		
		if(week < 5) {
			System.out.println();
		}
		
		System.out.println("\n=============================");
		System.out.println("<-이전(p)    종료(x)    다음(n)->\n\n\n");
	}
}

