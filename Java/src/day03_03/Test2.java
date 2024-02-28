package day03_03;

import lombok.ToString;

//생성자에서 생성자 호출
@ToString
class Car{
	String 제조사;
	Long 배기량;
	
	public Car(String 제조사, Long 배기량) {
		this.제조사 = 제조사;
		this.배기량 = 배기량;
	}
	public Car() {
		this("현대",1300L);
	}
	public Car(Long 배기량) {
		this("현대",배기량);
	}
	public Car(String 제조사) {
		this(제조사,1300L);
	}
}
public class Test2 {
	public static void main(String[] args) {
		Car r1 = new Car();
		Car r2 = new Car(2000L);
		Car r3 = new Car("기아",2000L);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
}
