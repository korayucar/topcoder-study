import org.junit.Test;
import static org.junit.Assert.*;

public class ThreeColorabilityEasyTest {
	
	@Test
	public void test0() {
		String[] cells = new String[] {"Z"};
		assertEquals("Yes", new ThreeColorabilityEasy().isColorable(cells));
	}
	
	@Test
	public void test1() {
		String[] cells = new String[] {"NZ"
,"NZ"};
		assertEquals("Yes", new ThreeColorabilityEasy().isColorable(cells));
	}
	
	@Test
	public void test2() {
		String[] cells = new String[] {"ZZZ"
,"ZNZ"};
		assertEquals("No", new ThreeColorabilityEasy().isColorable(cells));
	}
	
	@Test
	public void test3() {
		String[] cells = new String[] {"NZNZNNN"
,"NNZNNNZ"
,"NNNNZZZ"
,"ZZZNZZN"
,"ZZNZNNN"
,"NZZZZNN"
,"ZZZNZNN"};
		assertEquals("No", new ThreeColorabilityEasy().isColorable(cells));
	}
	
	@Test
	public void test4() {
		String[] cells = new String[] {"ZZZZ"
,"ZZZZ"
,"ZZZZ"};
		assertEquals("Yes", new ThreeColorabilityEasy().isColorable(cells));
	}
}
