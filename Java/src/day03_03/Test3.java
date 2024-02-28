package day03_03;

//부모클래스의 생성자 super()

//객체지향 구성요소
//1.캡슐화 : 클래스를 만들어라
//2.정보은닉 : 가능한한 private
//3.상속
//4.다형성


class 사원 {
	private String name;
	private Long nai;
	public 사원(String name, Long nai) {
		this.name = name;
		this.nai = nai;
	}
}

class 정규직 extends 사원{
	private String position;
	private Long salary;
	public 정규직(String name, Long nai, String position, Long salary) {
		//생성자 호출은 첫줄에서만 가능
		super(name,nai);
		this.position = position;
		this.salary = salary;
	}
}

public class Test3{
	public static void main(String[] args) {
		정규직 s1 = new 정규직("홍길동",30L,"대리",4000L);
	}
}