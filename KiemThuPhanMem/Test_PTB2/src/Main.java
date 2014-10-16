import static org.junit.Assert.*;

import org.junit.Test;


public class Main {
	Check_PTB2 pt = new Check_PTB2();
	@Test
	public void test1() {
		String result1 = pt.check(1.0, 2.0, 3.0);
		assertEquals("PT bac 2 vo nghiem", result1);
		
	}
	
	@Test
	public void test2() {
		String result1 = pt.check(3.0, 6.0, 3.0);
		assertEquals("PT co nghiem kep: -1.0", result1);
		
	}
	@Test
	public void test3() {
		String result1 = pt.check(1.0, -3.0, 2.0);
		assertEquals("PT co 2 nghiem: 2.0 ; 1.0", result1);
		
	}
	
	@Test
	public void test4() {
		String result1 = pt.check(0.0, 0.0, 0.0);
		assertEquals("PT vo so nghiem", result1);
		
	}
	
	@Test
	public void test5() {
		String result1 = pt.check(0.0, 1.0, 2.0);
		assertEquals("PT co 1 nghiem: -2.0", result1);
		
	}
	
	@Test
	public void test6() {
		String result1 = pt.check(0.0, 0.0, 2.0);
		assertEquals("PT vo nghiem", result1);
		
	}

}
