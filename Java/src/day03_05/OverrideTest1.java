package day03_05;

import java.util.ArrayList;
import java.util.List;

//객체지향 구성요소
//1.캡슐화
//2,정보은닉
//3.상속
// 	시작은 재사용 -> 부모의 참조변수로 작업한다.
//4.다형성 - 같은 이름의 메소드가 상황에따라 동작이 달라진다.
//  overload : 이름은 같고 인자는 다르다.
//  override : 똑같은 메소드(리턴,이름,인자 모두 같다.) - 상속

class 탈것{
}

class 트럭 extends 탈것{
	
}

class 버스 extends 탈것{
}

class Truck{
}
class Bus{
}


public class OverrideTest1 {
	public static void main(String[] args) {
		//부모클래스 : 추상적 분류(abstract class)
		//자식클래스 : 구체적인 실체(concrete class, 구상 클래스)
		
		//부모클래스를 다룰 수 있다면 모든 자식도 다룰 수 있다.
		List<탈것> list = new ArrayList<>();
		list.add(new 트럭());
		list.add(new 버스());
		//꺼내면 탈것이 나오기에 탈것의 기능을 쓸 수 있음
		
		List list2 = new ArrayList<>();
		list2.add(new Truck());
		list2.add(new Bus());
		//꺼내면 Object객체가 나오기에 고유기능을 쓸 수 없음
	}
}
