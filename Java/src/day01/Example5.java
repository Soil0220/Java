package day01;

import java.util.ArrayList;

public class Example5 {
	public static void main(String[] args) {
		//for문 : 일반 for 향상된 for(js의 of python의 in)
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		for(int i=0;i<3;i++) {
			System.out.println(list1.get(i));
		}
		
		for(int i=0;i<list1.size(); i++) {
			System.out.println(list1.get(i));
			//list1은 객체 -> 객체는 자기일은 자기가 알아서 하는 부품
			//list1은 크기를 본인이 알고있다.
		}
	}
}
