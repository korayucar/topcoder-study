import org.junit.Test;
import static org.junit.Assert.*;

public class ColorfulGardenHardTest {
	
	@Test(timeout=200000)
	public void test0() {
		String garden = "aaabbb";
		String forbid = "cccccc";
		assertEquals(2, new ColorfulGardenHard().count(garden, forbid));
	}
	
	@Test(timeout=2000000)
	public void test1() {
		String garden = "aabbcc";
		String forbid = "aabbcc";
		assertEquals(5, new ColorfulGardenHard().count(garden, forbid));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String garden = "aaaabb";
		String forbid = "xxxxxx";
		assertEquals(0, new ColorfulGardenHard().count(garden, forbid));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String garden = "abcdefghijklmno";
		String forbid = "zzzzzzzzzzzzzzz";
		assertEquals(674358851, new ColorfulGardenHard().count(garden, forbid));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String garden = "a";
		String forbid = "b";
		assertEquals(1, new ColorfulGardenHard().count(garden, forbid));
	}
	@Test(timeout=2000)
	public void test5() {
		String garden = "acabbcabacacb";
		String forbid = "cacccbacacaaa";
		assertEquals(6, new ColorfulGardenHard().count(garden, forbid));
	}
}
