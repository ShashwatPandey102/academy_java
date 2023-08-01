package homework;

// 달력 만들어 보기
public class CalMain {
	public static void main(String[] args) {

		Cal cal = new Cal();
		// 일단 켜면 오늘 날짜가 나오게 하기
		
		cal.view();
		
		loop: while(true) {
			
			try {
				// 먼저 달력을 보여준 후에 입력을 받아야 함

				String input = CalUtils.nextLine("입력해주세요 : ");
				
				switch(input) {
					case "p": // 이전
						cal.updateCal(false);
						cal.view();
						break;
					case "n": // 다음
						cal.updateCal(true);
						cal.view();
						break;
					case "x": // 종료
						System.out.println("프로그램이 종료되었습니다");
						break loop;
					default:
						throw new RuntimeException("p, n, x 중 입력해주세요");
				}
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
