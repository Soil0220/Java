package day02_08;

//상속의 활용
class Parent{
	int a;
}
class Child extends Parent{
	int b;
}


public class 상속Test3 {
	public static void main(String[] args) {
		//1.부모의 참조변수는 자식을 가리킬 수 있다.
		Parent ob1 = new Child();
		System.out.println(ob1.a);
		//System.out.println(ob1.b); 에러
		//역으로 자식이 부모를 가리키는것도 불가
		
		Child ob2 = new Child();
		System.out.println(ob2.a);
		System.out.println(ob2.b);
	}
	
	
}
