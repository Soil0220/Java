package day04_04;

//추상메소드 많이 사용하나요? 물 마시듯이
//왜 사용하느냐? 오버라이드와 함께
abstract class Parent{
	public abstract void insa();
	
}

class 첫째딸 extends Parent {
	//강요
	@Override
	public void insa() {
		System.out.println("안녕하세요");
	}
}

class 둘째아들 extends Parent{
	//강요
	@Override
	public void insa() {
		System.out.println("하이");
	}
}


public class 추상메소드Test2 {
	
}
