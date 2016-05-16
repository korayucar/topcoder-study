import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleXorTest {
	
	@Test
	public void test0() {
		int W = 1;
		assertEquals(0, new TriangleXor().theArea(W));
	}
	
	@Test
	public void test1() {
		int W = 2;
		assertEquals(1, new TriangleXor().theArea(W));
	}
	
	@Test
	public void test2() {
		int W = 3;
		assertEquals(1, new TriangleXor().theArea(W));
	}
	
	@Test
	public void test3() {
		int W = 4;
		assertEquals(2, new TriangleXor().theArea(W));
	}
	
	@Test
	public void test4() {
		int W = 5;
		assertEquals(2, new TriangleXor().theArea(W));
	}
	
	@Test
	public void test5() {
		int W = 12345;
		assertEquals(4629, new TriangleXor().theArea(W));
	}
}
