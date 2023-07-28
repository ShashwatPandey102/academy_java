package homework;

public class InheritancePractice3 {
	
	// Character 클래스를 만들어 나머지 클래스가 이를 상속받게 한다
	public static void main(String[] args) {
		Character warrior = new Warrior();
		Character gladiator = new Gladiator();
		Character wizard = new Wizard();
	}
}

class Character{
	int hp;
	int power;
	
	public void attack(Object target) {
		System.out.println("공격");
	}
}

class Warrior extends Character{
	int weapon;
	
	public void defence(Object target) {
		System.out.println("방어");
	}
}

class Gladiator extends Character{
	int shield;
	
	public void powerAttack(Object target) {
		System.out.println("파워공격");
	}
}

class Wizard extends Character{
	int heal;
	
	public void healing(Object target) {
		System.out.println("치료마법");
	}
}




