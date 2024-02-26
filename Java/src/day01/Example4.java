package day01;

import java.util.ArrayList;

public class Example4 {
//for문 : 일반 for, 향상된 for
	public static void main(String[] args) {
		//반복문을 사용하려면 데이터의 집합
		//python : list set tuple dictionary
		// 집합을 자바에서는 Collection
		//파이썬의 list -> 자바스크립트의 배열
		//python a = [1,3,5]
		//js : const a = [1,3,5];
		
		//자바는 ArrayList를 사용
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add("hello");
		//이런식으로 만들면 list1은 아무거나 전부 담을 수 있다.
		//담을 수 있는 값에 제한을 걸 수 있다.:다이아몬드 연산자
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		//list2.add("Hello"); 에러발생
		
	}
}
