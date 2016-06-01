import org.junit.Test;
import static org.junit.Assert.*;

public class RobotOnMoonTest {
	
	@Test
	public void test0() {
		String[] board = new String[] {"#####",
 "#...#",
 "#.S.#",
 "#...#",
 "#####"};
		assertEquals(-1, new RobotOnMoon().longestSafeCommand(board));
	}
	
	@Test
	public void test1() {
		String[] board = new String[] {"S......"};
		assertEquals(6, new RobotOnMoon().longestSafeCommand(board));
	}
	
	@Test
	public void test2() {
		String[] board = new String[] {"#.######",
 "#.#..S.#",
 "#.#.##.#",
 "#......#",
 "########"};
		assertEquals(-1, new RobotOnMoon().longestSafeCommand(board));
	}
	
	@Test
	public void test3() {
		String[] board = new String[] {"S"};
		assertEquals(0, new RobotOnMoon().longestSafeCommand(board));
	}
}
