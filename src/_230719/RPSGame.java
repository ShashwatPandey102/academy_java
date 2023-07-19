package _230719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RPSGame {
	public static void main(String[] args) {

		// 가위, 바위, 보

		// 컴퓨터가 셋 중에 임의의 수를 내야 함 (난수)
		// Math 클래스의 random 메소드 이용
		// 0 ~ 1 사이의 실수(double 타입)가 반환됨
		// 0은 포함이나 1은 포함하지 않은 값이 반환됨 (less than)

		// 100번 반복해서 1, 2, 3 각각 몇 개씩 나왔는지 확인
		// 0 : 가위, 1 : 바위, 2 : 보

		// java.io 클래스의 메소드들은 IOException을 필요로 하는 경우가 많아서, 그냥 Scanner로 해도 무관하다.
		// BufferedReader와 같은 애들이 성능은 좋지만, 예외 처리를 필요로 하는 경우가 많아진다.

		int count = 1; // 게임을 정상적으로 실행한 횟수
		int win = 0; // 이긴 횟수
		int lose = 0; // 진 횟수
		int realCount = 0; // 비긴 횟수를 제외한 횟수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			try {

				StringBuilder sb = new StringBuilder();

				System.out.printf("\n---------가위바위보 게임 (%d번째 게임)----------\n", count);
				System.out.println("낼 것을 선택해주세요 (0: 가위, 1: 바위, 2: 보)");

				int myInput = Integer.parseInt(br.readLine()); // 내가 낸 것
				String my = getHangul(myInput); // 내가 낸 것 한글로

				int comInput = (int) Math.floor(Math.random() * 3); // 컴퓨터
				String com = getHangul(comInput); // 컴퓨터가 낸 것 한글로

				sb.append("---------게임 결과----------\n");

				sb.append(String.format("내가 낸 것 : %s, 컴퓨터가 낸 것 : %s\n", my, com));

				int res = comInput - myInput; // 컴퓨터 - 나

				switch (res) {
				case 0: // 비긴 경우
					sb.append("비겼습니다\n");
					break;
				case -1: // 이긴 경우
				case 2:
					sb.append("이겼습니다\n");
					realCount++;
					win++;
					break;
				case -2: // 진 경우
				case 1:
					sb.append("졌습니다\n");
					realCount++;
					lose++;
					break;
				default:
					break;
				}
				
				double winRate = 0;
				
				if(realCount > 0) {
					winRate = win / (double)realCount * 100;
				}else {
					winRate = 0;
				}
				
				sb.append(String.format("승리: %d회, 패배: %d회, 승률: %.2f%%\n", win, lose, winRate));

				count++; // 게임을 정상적으로 실행한 횟수 증가

				System.out.println(sb); // 게임 내용 출력
				System.out.println("그만두시겠습니까? (y, n)");

				String quitText = br.readLine();
				boolean quit = false; // 안 그만둠

				switch (quitText) {
				case "y":
					quit = true;
					break;
				default: // 그 외의 경우 무조건 그만두게 함
					break;
				}

				if (quit) {
					System.out.println("게임을 종료합니다");
					break;
				}

			} catch (NumberFormatException e) {

				System.out.println("제대로 내 주세요\n");

			} catch (IOException e) {

				e.printStackTrace();

			}
		}

		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getHangul(int n) {
		String res = "";

		switch (n) { // 나
		case 0:
			res = "가위";
			break;
		case 1:
			res = "바위";
			break;
		case 2:
			res = "보";
			break;
		default:
			break;
		}

		return res;
	}
}
