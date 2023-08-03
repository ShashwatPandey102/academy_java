package marble;

import java.util.Random;

import lombok.Data;

@Data
public class Player {
	// 일단 위치를 가지고 있어야 한다
	
	// 일단 위치와 주사위 관련
	private int pos; // 현재 위치
	private int doubleCount; // 연속 더블 수
	
	public void roll() { // breakpoint 찍기 좋은 곳
	
		int dice = new Random().nextInt(6) + 1;
		int dice2 = new Random().nextInt(6) + 1;
		int result = dice + dice2;
		
		System.out.printf("주사위1 : %d, 주사위2: %d, 합계: %d\n", dice, dice2, result);

		if(dice == dice2) {
			doubleCount++;
		}else {
			doubleCount = 0;
		}
		
		pos += result;
		pos %= 32;
		
	}
}
