package _230727;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal[] ani = new Animal[4];
		
		int k = 0;
		ani[k++] = new Eagle("조류", "독수리");
		ani[k++] = new Tiger("포유류", "호랑이");
		ani[k++] = new Lion("포유류", "사자");
		ani[k++] = new Shark("어류", "상어");
		
		for(Animal a : ani) { // 선언될 때 Animal로 선언되었으므로 이렇게 한다
			a.sleep(); // 같은 부모 클래스에 있기에 이런 식으로 사용할 수가 있는 것이다
		}
		
		// 만약 Animal에 sleep() 메서드를 작성하지 않았을 경우 아래와 같이 불편한 절차를 거쳐야 함
		for(Animal a : ani) {
			// 각각 어떤 타입의 인스턴스인지를 확인 후 해당 타입의 sleep()을 호출해야 함
			if(a instanceof Eagle) {
				((Eagle)a).sleep();
			}else if(a instanceof Tiger) {
				((Tiger)a).sleep();
			}else if(a instanceof Lion) {
				((Lion)a).sleep();
			}else if(a instanceof Shark) {
				((Shark)a).sleep();
			}
		}
		
		System.out.println(ani[0] instanceof Eagle);
		System.out.println(ani[0] instanceof Tiger); // Eagle이 Animal의 또 다른 자식이 Tiger로 형변환될 수 있느냐? 안 됨
		System.out.println(ani[0] instanceof Animal);
		System.out.println(ani[0] instanceof Object);
		
		Animal e = (Animal)(Eagle) new Eagle("조류", "독수리");
		long l = (long)(int)10;
		
		System.out.println(e);
		
	}
}
