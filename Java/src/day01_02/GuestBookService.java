package day01_02;

import java.time.LocalDate;
import java.util.ArrayList;

public class GuestBookService {
	
	ArrayList<GuestBook> list = new ArrayList<GuestBook>();
	
	public ArrayList<GuestBook> findAll() {
		return list;
	}
	
	public GuestBook findById(long bno) {
		for(GuestBook element:list) {
			if(element.getBno() == bno) {
				return element;
			}
		}
		return null;
	}
	
	public void save(long bno, String content, LocalDate writeday, String nickname) {
		GuestBook guestBook = new GuestBook(bno,content,writeday,nickname);
		list.add(guestBook);
	}
	
	public long delete(long bno) {
		for(GuestBook element:list) {
			if(element.getBno() == bno) {
				bno = element.getBno();
				list.remove(element);
				return 1L;
			}
		}
		return 0L;
	}
	
}
