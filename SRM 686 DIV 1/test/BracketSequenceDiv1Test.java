import org.junit.Test;
import static org.junit.Assert.*;

public class BracketSequenceDiv1Test {
	
	@Test
	public void test0() {
		String s = "()[]";
		assertEquals(3L, new BracketSequenceDiv1().count(s));
	}
	
	@Test
	public void test1() {
		String s = "())";
		assertEquals(2L, new BracketSequenceDiv1().count(s));
	}
	
	@Test
	public void test2() {
		String s = "()()";
		assertEquals(4L, new BracketSequenceDiv1().count(s));
	}
	
	@Test
	public void test3() {
		String s = "([)]";
		assertEquals(2L, new BracketSequenceDiv1().count(s));
	}
	
	@Test
	public void test4() {
		String s = "())[]][]([]()]]()]]]";
		assertEquals(3854L, new BracketSequenceDiv1().count(s));
	}
}
