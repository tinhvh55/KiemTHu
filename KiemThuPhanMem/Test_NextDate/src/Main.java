import static org.junit.Assert.*;

import org.junit.Test;


public class Main {
	
	@Test
	public void test1() {
		Find_NextDate nextDate = new Find_NextDate(31,12 , 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("1/1/2015", result1);
	}

	@Test
	public void test2() {
		Find_NextDate nextDate = new Find_NextDate(29,2 , 2008);
		String result1 = nextDate.get_NextDate();
		assertEquals("1/3/2008", result1);
	}
	
	@Test
	public void test3() {
		Find_NextDate nextDate = new Find_NextDate(28,2 , 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("1/3/2014", result1);
	}
	
	@Test
	public void test4() {
		Find_NextDate nextDate = new Find_NextDate(30, 6, 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("1/7/2014", result1);
	}
	
	@Test
	public void test5() {
		Find_NextDate nextDate = new Find_NextDate(31, 3, 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("1/4/2014", result1);
	}
	
	@Test
	public void test6() {
		Find_NextDate nextDate = new Find_NextDate(15, 6, 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("16/6/2014", result1);
	}
	
	@Test
	public void test7() {
		Find_NextDate nextDate = new Find_NextDate(0, 6, 2014);
		String result1 = nextDate.get_NextDate();
		assertEquals("Dữ liệu không hợp lệ", result1);
	}
}
