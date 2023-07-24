package _230724;

public class Deck {
	// 덱 1개에 카드 52장 배열
	Card[] cards = new Card[52]; // 덱 클래스의 멤버변수로서 52장짜리 카드 배열이 있음.
	
	// 인스턴스 초기화 블록 (덱 클래스가 생성될 때 카드 배열을 초기화함)
	{ 
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new Card();
			
			cards[i].kind = i / 13; // 0이 CLOVER
			cards[i].number = i % 13; // 0이 2
		}
	}
	
	// 카드를 섞는 기능
	void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int number = (int)(Math.random() * cards.length);
			
			Card tmp = cards[i];
			cards[i] = cards[number];
			cards[number] = tmp;
		}
	}
	
	Card draw() {
		int n = (int)(Math.random() * cards.length);
		
		return cards[n];
	}
	
}
