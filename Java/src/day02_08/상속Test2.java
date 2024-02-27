package day02_08;

//천원샵이 있다고 했을 때
//부모에게 상속받아 사용해보자

class Product{
	Long price = 1000L;
}

class Pen extends Product{
	String name = "펜";
	void 상품소개() {
		System.out.println(price + "원짜리" + name);
	}
}

class Note extends Product{
	String name= "노트";
	void 상품소개() {
		System.out.println(price + "원짜리" + name);
	}
}

public class 상속Test2 {
	
}
