package day03_01;



/*
 	객체지향의 궁극적인 코드 재사용을 이용한 생산성 증가
 	상속 : 객체의 모든 필드와 기능을 내가 재사용할 수 있다.
 	자식 extends 부모
 		자식-sub class, derived class(파생 클래스)
 		부모-super class, base class(기반 클래스)
 		
 */

class MyCalc extends Calc {
	public int mul(int a,int b) {
		return a*b;
	}
}

public class MyCalcTest {
	public static void main(String[] args) {
		MyCalc myCalc = new MyCalc();
		System.out.println(myCalc.mul(20,10));
		System.out.println(myCalc.sum(20,10));
	}
}
