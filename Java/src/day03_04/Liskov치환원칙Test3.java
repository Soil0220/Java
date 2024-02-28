package day03_04;

import lombok.*;

// ================== com.world.tire 패키지 =============================
class 타이어 {
	
}
class 한국타이어 extends 타이어 {
	
}
class 넥센타이어 extends 타이어 {
	
}
class 브릿지스톤 extends 타이어{
	
}
// =================== com.world.car 패키지 =================================


@Setter
class Car {
	타이어 tire;
}

public class Liskov치환원칙Test3 {
	public static void main(String[] args) {
		Car car = new Car();
		//실제로 사용하는 타이어는 브릿지스톤
		//참조변수는 항상 부모를 사용
		car.setTire(new 브릿지스톤());
		
		
	}
}