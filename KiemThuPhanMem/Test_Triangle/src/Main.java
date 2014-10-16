import static org.junit.Assert.*;
import java.*;
import org.junit.Test;


public class Main {
	Check_Triangle tri = new Check_Triangle();
	@Test
	public void test1() {
		
		String result1 = tri.check(2.0, 3.0, 2.0);
		assertEquals("Tam giac can", result1);
	}
	@Test
	public void test2(){
		String result2 = tri.check(0,  0,  0);
		assertEquals("Khong la tam giac", result2);
	}
	@Test
	public void test3(){
		String result3 = tri.check(5.0,  5.0,  5.0);
		assertEquals("Tam giac deu", result3);
	}
	@Test
	public void test4(){
		String result4 = tri.check(3.0,  4.0,  5.0);
		assertEquals("Tam giac vuong", result4);
	}
	@Test
	public void test5(){
		String result5 = tri.check(1.0, 1.0, Math.sqrt(2.0));
		assertEquals("Tam giac vuong can", result5);
	}

}
