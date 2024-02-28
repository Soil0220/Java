package day03_06;

import java.util.ArrayList;
import java.util.List;

//오버라이드 : 부모와 자식이 똑같은 메소드를 가질 때 자식의 것을 호출

//부모의 참조변수로 작업을 한다.
//하지만 동작은 자식마다 다르게 작동
//부모는 표준이기에 함수의 이름을 정하고 자식은 각 개별 커스터마이징을 진행
//bus, 비행기는 super.go()를 가진다.
//자식이 go()를 다시 만들면 this.go()를 실행
class 탈것{
	public void go() {
		System.out.println("부모의 go");
	}
}

class Bus extends 탈것{
	public void go() {
		System.out.println("버스가 달려감");
	}
}
class 비행기 extends 탈것 {
	public void go() {
		System.out.println("비행기가 날아감");
	}
}

public class OverrideTest2 {
	public static void main(String[] args) {
		List<탈것> list = new ArrayList<>();
		list.add(new Bus());
		list.add(new 비행기());
		
		for(탈것 v:list) {
			v.go();
		}
		//부모를 다룰 수 있다면 모든 자식도 다룰 수 있따.
		//1. 부모가 인자인 함수는 모든 자식도 인자로 받을 수 있다.
		//2. 부모를 저장할 수 있다면 자식도 저장할 수 있다.
	}
}
