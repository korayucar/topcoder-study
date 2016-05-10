import org.junit.Test;
import static org.junit.Assert.*;

public class QueueingTest {
	
	@Test
	public void test0() {
		int len1 = 1;
		int len2 = 2;
		int p1 = 2;
		int p2 = 1;
		assertEquals(0.5, new Queueing().probFirst(len1, len2, p1, p2), 1e-9);
	}
	
	@Test
	public void test1() {
		int len1 = 1;
		int len2 = 3;
		int p1 = 3;
		int p2 = 7;
		assertEquals(0.9835390946502058, new Queueing().probFirst(len1, len2, p1, p2), 1e-9);
	}
	
	@Test
	public void test2() {
		int len1 = 3;
		int len2 = 1;
		int p1 = 7;
		int p2 = 3;
		assertEquals(0.010973936899862834, new Queueing().probFirst(len1, len2, p1, p2), 1e-9);
	}
	
	@Test
	public void test3() {
		int len1 = 12;
		int len2 = 34;
		int p1 = 56;
		int p2 = 78;
		assertEquals(0.999996203228025, new Queueing().probFirst(len1, len2, p1, p2), 1e-9);
	}
	
	@Test
	public void test4() {
		int len1 = 3;
		int len2 = 6;
		int p1 = 8;
		int p2 = 4;
		assertEquals(0.5229465300297028, new Queueing().probFirst(len1, len2, p1, p2), 1e-9);
	}
}
