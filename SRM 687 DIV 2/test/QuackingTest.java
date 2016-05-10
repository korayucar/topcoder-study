import org.junit.Test;
import static org.junit.Assert.*;

public class QuackingTest {
	
	@Test
	public void test0() {
		String s = "quqacukqauackck";
		assertEquals(2, new Quacking().quack(s));
	}
	
	@Test
	public void test1() {
		String s = "kcauq";
		assertEquals(-1, new Quacking().quack(s));
	}
	
	@Test
	public void test2() {
		String s = "quackquackquackquackquackquackquackquackquackquack";
		assertEquals(1, new Quacking().quack(s));
	}
	
	@Test
	public void test3() {
		String s = "qqqqqqqqqquuuuuuuuuuaaaaaaaaaacccccccccckkkkkkkkkk";
		assertEquals(10, new Quacking().quack(s));
	}
	
	@Test
	public void test4() {
		String s = "quqaquuacakcqckkuaquckqauckack";
		assertEquals(3, new Quacking().quack(s));
	}
	
	@Test
	public void test5() {
		String s = "quackqauckquack";
		assertEquals(-1, new Quacking().quack(s));
	}
}
