import org.junit.Test;
import static org.junit.Assert.*;

public class JumpFurtherTest {
	
	@Test
	public void test0() {
		int N = 2;
		int badStep = 2;
		assertEquals(3, new JumpFurther().furthest(N, badStep));
	}
	
	@Test
	public void test1() {
		int N = 2;
		int badStep = 1;
		assertEquals(2, new JumpFurther().furthest(N, badStep));
	}
	
	@Test
	public void test2() {
		int N = 3;
		int badStep = 3;
		assertEquals(5, new JumpFurther().furthest(N, badStep));
	}
	
	@Test
	public void test3() {
		int N = 1313;
		int badStep = 5858;
		assertEquals(862641, new JumpFurther().furthest(N, badStep));
	}
	
	@Test
	public void test4() {
		int N = 1;
		int badStep = 757065;
		assertEquals(1, new JumpFurther().furthest(N, badStep));
	}
}
