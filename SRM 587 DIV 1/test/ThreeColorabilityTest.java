import org.junit.Test;
import static org.junit.Assert.*;

public class ThreeColorabilityTest {
	
	@Test
	public void test0() {
		String[] cells = new String[] {"Z"};
		assertArrayEquals(new String[] {"Z" }, new ThreeColorability().lexSmallest(cells));
	}
	
	@Test
	public void test1() {
		String[] cells = new String[] {"??", "?N"};
		assertArrayEquals(new String[] {"NN", "NN" }, new ThreeColorability().lexSmallest(cells));
	}
	
	@Test
	public void test2() {
		String[] cells = new String[] {"ZZZ", "ZNZ"};
		assertArrayEquals(new String[] { }, new ThreeColorability().lexSmallest(cells));
	}
	
	@Test
	public void test3() {
		String[] cells = new String[] {"N?N??NN","??ZN??Z","NN???Z?","ZZZ?Z??","Z???NN?","N?????N","ZZ?N?NN"};
		assertArrayEquals(new String[] { }, new ThreeColorability().lexSmallest(cells));
	}
	
	@Test
	public void test4() {
		String[] cells = new String[] {"ZZZZ","ZZZZ","ZZZZ"};
		assertArrayEquals(new String[] {"ZZZZ", "ZZZZ", "ZZZZ" }, new ThreeColorability().lexSmallest(cells));
	}
}
