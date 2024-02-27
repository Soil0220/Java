package day02_08;

//상속: 부모의 요소를 자식이 사용가능

class 부모{
	int 부모재산=1000000;
}

class 자식 extends 부모{
	int 자식재산=50000;
}
public class 상속Test1 {
	public static void main(String[] args) {
		자식 ob = new 자식();
		System.out.println(ob.부모재산);
		System.out.println(ob.자식재산);
	}
	
}
