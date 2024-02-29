package day04_03;

import lombok.AllArgsConstructor;

//Object 클래스 : 자바의 모든 클래스의 부모
//부모클래스가 없는 경우 자동으로 extends Object가 추가된다.

//object 클래스의 역할 -> 메소드의 이름을 정해준다.



@AllArgsConstructor
class Product{
	private String name;
	private int price;
	
	@Override
	public String toString() {
		//TODO Auto-generated method stub
		return "name:" + name + ", price:" + price;
	}
	
	@Override
	public int hashCode() {
		//객체를 구별하는 번호
		//헤시코드를 생성하는 자바 알고리즘이 충분히 강력하지 않네
		//필요하면 확장가능
		return super.hashCode();
	}
}


public class ObjectTest1 {
	public static void main(String[] args) {
		Product p = new Product("컵누들",1500);
		//객체를 출력하라고 하면 toString()메소드가 자동으로 호출
		System.out.println(p.toString());
		
		
	}
}
