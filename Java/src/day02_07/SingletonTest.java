package day02_07;

class BoardService{
	public BoardService() {
		
	}
	
	private static BoardService bs = new BoardService();
	public static BoardService getInstance() {
		return bs;
	}

}



public class SingletonTest {
	public static void main(String[] args) {
		//BoardService service = new BoardService(); 에러
		BoardService s1 = BoardService.getInstance().getInstance();
		System.out.println(s1);
		BoardService s2 = BoardService.getInstance();
		System.out.println(s2);
		//둘다 해쉬코드가 같다.
	}
}
