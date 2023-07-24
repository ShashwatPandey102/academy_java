package _230724;

public class CardEx {
	public static void main(String[] args) {
		
		Deck deck = new Deck(); // 카드 덱을 생성
		
//		// 덱에 들어 있는 카드를 하나씩 확인
//		for (int i = 0; i < deck.cards.length; i++) {
//			System.out.println(deck.cards[i].toString());
//			
//			if(i % 13 == 12) {
//				System.out.println("=============================");
//			}
//		}
//		
//		deck.shuffle();
//
//		// 덱에 들어 있는 카드를 하나씩 확인
//		for (int i = 0; i < deck.cards.length; i++) {
//			System.out.println(deck.cards[i].toString());
//			
//		}
		
		// 덱에서 카드 하나 뽑기
		System.out.println(deck.draw());
		
	}
}
