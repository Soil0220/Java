package day02_04;



//체력 : 40/40 -> 40/28 -> 40/0
public class Marine {
	
	//전체 마린이 공유
	public static Long 전체체력;
	//마린마다 다르다.
	private Long 현재체력;
	
	public Marine() {
		현재체력 = 40L;
	}
}
