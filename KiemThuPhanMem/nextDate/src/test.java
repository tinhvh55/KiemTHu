import static org.junit.Assert.*;

import org.junit.Test;


public class test {

	@Test
	public void test0() {
		NextDate n = new NextDate();
		assertEquals(n.nextDate(28, 2, 2012),"1/3/2012");
	}
	@Test
	public void test1() {
		NextDate n = new NextDate();
		assertEquals(n.nextDate(31, 12, 2012),"1/1/2013");
	}
	@Test
	public void test2() {
		NextDate n = new NextDate();
		assertEquals(n.nextDate(2, 2, 2012),"3/2/2012");
	}
	@Test
	public void test3() {
		NextDate n = new NextDate();
		assertEquals(n.nextDate(28, 2, 2012),"29/2/2012");
	}

}
