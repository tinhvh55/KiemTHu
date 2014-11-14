import static org.junit.Assert.*;

import org.junit.Test;


public class testTamGiac {

	@Test
	public void test() {
		TamGiac t = new TamGiac();
		assertEquals(t.check(1, 2, 3),0);
	}
	@Test
	public void test1() {
		TamGiac t = new TamGiac();
		assertEquals(t.check(0, 0, 0),-1);
	}
	@Test
	public void test2() {
		TamGiac t = new TamGiac();
		assertEquals(t.check(1,1, 1),3);
	}
	@Test
	public void test3() {
		TamGiac t = new TamGiac();
		assertEquals(t.check(3, 4, 3),2);
	}
	@Test
	public void test4() {
		TamGiac t = new TamGiac();
		assertEquals(t.check(3, 5, 2),1);
	}
	
}
