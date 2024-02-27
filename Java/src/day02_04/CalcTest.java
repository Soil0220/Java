package day02_04;

class Calc{
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
}


public class CalcTest {
	public static void main(String[] args) {
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		//객체를 만든다 -> 두 객체는 다르다.
		//c1.sum(2,5);
		//c2.sum(2,5);
		
		System.out.println(Calc.sum(3, 4));
	}
}
