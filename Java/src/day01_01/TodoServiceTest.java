package day01_01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class TodoServiceTest {
	private TodoService service = new TodoService();
	
	//junit으로 테스트 하려면 반드시 public void형식이어야한다.
	@Test
	public void findAllTest() {
		//todo가 없는 상태에서 0인지 테스트
		ArrayList<Todo> list1 = service.findAll();
		assertEquals(0,list1.size());
		
		service.save(new Todo(1L,"1",LocalDate.now(),false));
		ArrayList<Todo> list =  service.findAll();
		//검증메소드
		assertEquals(1,list.size());
	}
	
	//모든 @Test메소드들은 독립적으로 실행된다.
	@Test
	public void deleteTest() {
		service.save(new Todo(1L,"2",LocalDate.now(),false));
		service.save(new Todo(2L,"3",LocalDate.now(),false));
		assertEquals(1L,service.delete(2L));
		
		//삭제 실패 테스트
		assertEquals(0L,service.delete(222L));
	}
	
	@Test
	public void updateTest() {
		service.save(new Todo(1L,"2",LocalDate.now(),false));
		service.save(new Todo(2L,"3",LocalDate.now(),false));
		assertEquals(1L,service.change(1L));

	}
}
