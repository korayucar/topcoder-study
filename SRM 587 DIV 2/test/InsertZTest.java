import org.junit.Test;
import static org.junit.Assert.*;

public class InsertZTest {
	
	@Test
	public void test0() {
		String init = "fox";
		String goal = "fozx";
		assertEquals("Yes", new InsertZ().canTransform(init, goal));
	}
	
	@Test
	public void test1() {
		String init = "fox";
		String goal = "zfzoxzz";
		assertEquals("Yes", new InsertZ().canTransform(init, goal));
	}
	
	@Test
	public void test2() {
		String init = "foon";
		String goal = "foon";
		assertEquals("Yes", new InsertZ().canTransform(init, goal));
	}
	
	@Test
	public void test3() {
		String init = "topcoder";
		String goal = "zopzoder";
		assertEquals("No", new InsertZ().canTransform(init, goal));
	}
	
	@Test
	public void test4() {
		String init = "aaaaaaaaaa";
		String goal = "a";
		assertEquals("No", new InsertZ().canTransform(init, goal));
	}
	
	@Test
	public void test5() {
		String init = "mvixrdnrpxowkasufnvxaq";
		String goal = "mvizzxzzzrdzznzrpxozzwzzkazzzszzuzzfnvxzzzazzq";
		assertEquals("Yes", new InsertZ().canTransform(init, goal));
	}
	
	@Test
	public void test6() {
		String init = "opdlfmvuicjsierjowdvnx";
		String goal = "zzopzdlfmvzuicjzzsizzeijzowvznxzz";
		assertEquals("No", new InsertZ().canTransform(init, goal));
	}
}
