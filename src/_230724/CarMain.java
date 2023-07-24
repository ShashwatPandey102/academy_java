package _230724;

public class CarMain {
	public static void main(String[] args) {
		
		Car tico = new Car(); // 객체 생성 (인스턴스화)
		Car pride = new Car();
		
		tico.color = "화이트";
		tico.company = "대우";
		tico.type = "경차";
		
		pride.color = "블랙";
		pride.company = "기아";
		pride.type = "소형";
		
		tico.go();
		pride.back();
		
		System.out.println(tico.toString());
		System.out.println(pride.toString());
		
		System.out.println(tico.color);
		System.out.println(pride.color);
	}
}
