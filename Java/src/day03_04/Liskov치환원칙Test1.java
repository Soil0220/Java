package day03_04;

import lombok.*;

// ================== com.world.handPhone 패키지 =============================
class 핸드폰 {
	
}
class 삼성갤럭시 extends 핸드폰 {
	
}
class 아이폰1 extends 핸드폰 {
	
}
class 아이폰2 extends 핸드폰 {
	
}
class 아이폰3 extends 핸드폰 {
	
}

// =================== com.world.saram 패키지 =================================

@AllArgsConstructor
class Saram {
	private 핸드폰 phone;
}

public class Liskov치환원칙Test1 {
	//부모와 자식관계의 클래스들이 있을 때 자식클래스를 내가 가진 클래스에 담고싶다면
	//자식클래스를 일일이 담을경우 초기화 시킬 때 전부 써줘야하지만 부모(Phone)를 담으면
	//Phone으로 부모의 자식들을 받을 수 있게되기에 일일이 초기화 시킬필요없다.
	public static void main(String[] args) {
		Saram saram = new Saram(new 아이폰1());
	}
}