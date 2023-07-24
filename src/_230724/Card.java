package _230724;

public class Card {
	// 무늬 (0, 1, 2, 3)
	// CLOVER, HEART, DIAMOND, SPADE
	// 0 ~ 3
	int kind;
	
	// 숫자 (2 ~ 9, X, J, Q, K, A)
	// 0 ~ 12
	int number;

	@Override
	public String toString() {
		String[] kinds = {"CLOVER", "HEART", "DIAMOND", "SPADE"}; // 카드 무늬에 대한 문자열 배열
		String numbers = "23456789XJQKA";
		
		return String.format("Card [%s, %c]", kinds[kind], numbers.charAt(number));
	}
	
}
