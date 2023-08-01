package homework;

import lombok.Data;

public class ApiPractice2 {
	public static void main(String[] args) {
		
		Car car = new Car();
	
		car.setName("그랜져");
		car.setCompany("현대자동차");
		
		System.out.println(car);
	}
}

@Data
class Car{
	private String name;
	private String company;
	
	@Override
	public String toString() {
		return String.format("%s:%s", this.company, this.name);
	}
	
}