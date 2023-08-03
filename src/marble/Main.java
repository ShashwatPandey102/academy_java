package marble;

public class Main {
	public static void main(String[] args) { // breakpoint 찍기 좋은 곳
		// main에서는 게임의 전체적인 진행(게임 초기화, 플레이어 수 받기 등)을 담당함
		
		GameService gameService = new GameService();
		
		int playerCount = Utils.nextInt("플레이할 인원수를 정하세요 > ");
		
		for (int i = 0; i < playerCount; i++) {
			gameService.players.add(new Player());
		}

		// 게임 끝날 때까지 무한 루프인데 지금 누가 플레이 중인지 알고 싶을 때 이렇게 사용한다.
		// 이런 순환 패턴은 익혀서 잘 사용하는 게 좋다
		for (int i = 0; ; i++) {
			int pNum = i % gameService.players.size(); // 현재 플레이 중인 플레이어 넘버 (계속 사용할 것임)
			Player p = gameService.players.get(pNum); // 현재 플레이 중인 플레이어 객체
			
			Utils.nextLine("플레이어 " + (pNum + 1) + "의 차례입니다. 엔터를 누르세요 > "); // 단지 현재 플레이어의 차례를 인식시키고 엔터를 한 번 치게 만들려고 이렇게 함 (주사위 굴리는 느낌을 주는 것)
			
			p.roll();
			
			System.out.println("더블 여부 : " + p.getDoubleCount());
			System.out.println("현재 위치 : " + p.getPos() + " :: " + gameService.areas.get(p.getPos()));
		}
	}
}

