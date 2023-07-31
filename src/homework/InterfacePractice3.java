package homework;

public class InterfacePractice3 {
	public static void main(String[] args) {

		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer();
		
		BaseBallPlayer p3 = new BaseBallPlayer();
		
		Player p4 = p3; // 큰 것에 작은 것을 넣는 거라 됨 (묵시적 형변환 가능)

		playGame(p1);
		playGame(p2);
		
	}

	public static void playGame(Player p) {
		p.play();
	}
}

interface Player {
	void play(); // 추상 메서드
}

class BaseBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("야구선수가 야구를 합니다.");
	}
}

class FootBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("축구선수가 축구를 합니다.");
	}
}