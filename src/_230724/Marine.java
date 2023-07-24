package _230724;

public class Marine {
	
	// 필드
	final int maxHp = 45; // 최대 체력
	int nowHp = maxHp; // 현재 체력
	static int att; // 공격력 -> 같은 클래스마다 동일하게 적용됨
	static int def; // 방어력
	int res; // 요구 자원
	int pop; // 요구 인구 수
	
	
	@Override
	public String toString() {
		return "Marine [maxHp=" + maxHp + ", nowHp=" + nowHp + ", att=" + att + ", def=" + def + ", res=" + res + ", pop=" + pop + "]";
	}

}
