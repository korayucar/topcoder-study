import org.junit.Test;
import static org.junit.Assert.*;

public class IstrTest {
	
	@Test
	public void test0() {
		String s = "aba";
		int k = 1;
		assertEquals(2, new Istr().count(s, k));
	}
	
	@Test
	public void test1() {
		String s = "abacaba";
		int k = 0;
		assertEquals(21, new Istr().count(s, k));
	}
	
	@Test
	public void test2() {
		String s = "abacaba";
		int k = 1;
		assertEquals(14, new Istr().count(s, k));
	}
	
	@Test
	public void test3() {
		String s = "abacaba";
		int k = 3;
		assertEquals(6, new Istr().count(s, k));
	}
	
	@Test
	public void test4() {
		String s = "abc";
		int k = 3;
		assertEquals(0, new Istr().count(s, k));
	}
	
	@Test
	public void test5() {
		String s = "wersrsresesrsesrawsdsw";
		int k = 11;
		assertEquals(23, new Istr().count(s, k));
	}
}
