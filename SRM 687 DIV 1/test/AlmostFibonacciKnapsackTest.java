import org.junit.Test;
import static org.junit.Assert.*;

public class AlmostFibonacciKnapsackTest {
	
	@Test
	public void test0() {
		long x = 148L;
		assertArrayEquals(new int[] {6, 10, 8, 5 }, new AlmostFibonacciKnapsack().getIndices(x));
	}
	
	@Test
	public void test1() {
		long x = 2L;
		assertArrayEquals(new int[] {1 }, new AlmostFibonacciKnapsack().getIndices(x));
	}
	
	@Test
	public void test2() {
		long x = 13L;
		assertArrayEquals(new int[] {2, 3, 4 }, new AlmostFibonacciKnapsack().getIndices(x));
	}
	
	@Test
	public void test3() {
		long x = 3L;
		assertArrayEquals(new int[] {2 }, new AlmostFibonacciKnapsack().getIndices(x));
	}
	
	@Test
	public void test4() {
		long x = 86267769395L;
		assertArrayEquals(new int[] {3, 14, 15, 9, 26, 53, 5, 8 }, new AlmostFibonacciKnapsack().getIndices(x));
	}
}
