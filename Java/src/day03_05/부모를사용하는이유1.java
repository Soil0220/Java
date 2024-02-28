package day03_05;

//개방폐쇄원칙

//===동물
//=== Cat, Dog, Pig는 Animal로 대표된다.
class Animal{
	
}

class 고양이 extends Animal{
	
}
class 강아지 extends Animal{
	
}


//=== 고객들
//=== 동물의 외부 패키지에는 동물을 대표하는 Animal로 작업한다.

class Hospital {
	public void 예방접종(Animal animal) {

	}
}
public class 부모를사용하는이유1 {
	public static void main(String[] args) {
		Hospital h = new Hospital();
		h.예방접종(new 고양이());
		h.예방접종(new 강아지());
	}
}
