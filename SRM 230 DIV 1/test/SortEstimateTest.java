import org.junit.Test;
import static org.junit.Assert.*;

public class SortEstimateTest {
	
	@Test
	public void test0() {
		int c = 1;
		int time = 8;
		assertEquals(4.0, new SortEstimate().howMany(c, time), 1e-9);
	}
	
	@Test
	public void test1() {
		int c = 2;
		int time = 16;
		assertEquals(4.0, new SortEstimate().howMany(c, time), 1e-9);
	}
	
	@Test
	public void test2() {
		int c = 37;
		int time = 12392342;
		assertEquals(23104.999312341137, new SortEstimate().howMany(c, time), 1e-9);
	}
	
	@Test
	public void test3() {
		int c = 1;
		int time = 2000000000;
		assertEquals(7.637495090348122E7, new SortEstimate().howMany(c, time), 1e-9);
	}
}
