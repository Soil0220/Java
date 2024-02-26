package day01_02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class GuestBookServiceTest {
	private GuestBookService service = new GuestBookService();
	
	@Test
	public void findByIdTest() {
		service.save(1L,"1",LocalDate.now(),"nickname1");
		service.save(2L,"2",LocalDate.now(),"nickname1");
		service.save(3L,"3",LocalDate.now(),"nickname1");
		System.out.println(service.findAll());
		assertNull(service.findById(222L));
		assertNotNull(service.findById(2L));
	}
	@Test
	public void deleteTest() {
		service.save(1L,"1",LocalDate.now(),"nickname1");
		service.save(2L,"2",LocalDate.now(),"nickname1");
		service.save(3L,"3",LocalDate.now(),"nickname1");
		assertEquals(1L, service.delete(3L));
		assertEquals(0L, service.delete(3L));
		assertEquals(0L, service.delete(333L));
		System.out.println(service.findAll());
	}

}
