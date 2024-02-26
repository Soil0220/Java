package day01_01;

import java.util.ArrayList;

public class TodoService {

	private ArrayList<Todo> list = new ArrayList<>();

	
	//할일 추가 메소드 
	public void save(Todo todo) {
		list.add(todo);
	}
	
	public ArrayList<Todo> findAll() {
		return list;
	}
	
	public long delete(Long tno) {
		for(Todo t:list) {
			if(t.getTno()==tno) {
				list.remove(t);
				return 1L;
			}
		}
		return 0L;
	}
	
	//업데이트
	public Long change(Long tno) {
		for(Todo t:list) {
			if(t.getTno()==tno) {
				t.setFinish(!t.getFinish());
				return 1L;
			}
		}
		return 0L;
	}
}
