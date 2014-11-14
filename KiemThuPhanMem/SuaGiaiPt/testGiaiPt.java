import static org.junit.Assert.*;

import org.junit.Test;


public class testGiaiPt {

	@Test
	public void test1() {
		GiaiPt g = new GiaiPt();
		assertEquals(g.Giai(1,2,1),"-1.0");
	}

	@Test
	public void test2() {
		GiaiPt g = new GiaiPt();
		assertEquals(g.Giai(1,7,1),"VN");
	}
	@Test
	public void test3() {
		GiaiPt g = new GiaiPt();
		assertEquals(g.Giai(1,-5,6),"3.0;2.0");
	}
	@Test
	public void test4() {
		GiaiPt g = new GiaiPt();
		assertEquals(g.Giai(0,2,4),"-2.0");
	}

}
