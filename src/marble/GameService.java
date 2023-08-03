package marble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameService {
	// 플레이어 관리
	List<Player> players = new ArrayList<>();
	
	// 지역 관리
	List<String> areas = new ArrayList<>();
	
	// 초기화 블럭
	{
		String str = "시작 > 방콕 > 보너스게임(동전던지기) > 베이징 > 포츈카드 > 독도 > 두바이 > 카이로 > 무인도 > 발리 > 도쿄 > 시드니 > 포츈카드 > 퀘백 > 하와이 > 상파울루 > 올림픽 > 프라하 > 푸켓 > 베를린 > 포츈카드 > 모스크바 > 제네바 > 로마 > 세계여행 > 타히티 > 런던 > 파리 > 포츈카드 > 뉴욕 > 국세청 > 서울";

		String areasArr[] = str.split(" > ");
		
		areas.addAll(Arrays.asList(areasArr)); // 더하는 개념이면 그대로 자유자재로 조절이 가능한 List인데,
		// 바로 Arrays.asList를 넣어버리면 길이가 자유자재로 조절이 안되기에 이렇게 한 것이다.
	}
}



