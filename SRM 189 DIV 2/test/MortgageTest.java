import org.junit.Test;
import static org.junit.Assert.*;

public class MortgageTest {
	
	@Test
	public void test0() {
		int loan = 1000;
		int interest = 50;
		int term = 1;
		assertEquals(86, new Mortgage().monthlyPayment(loan, interest, term));
	}
	
	@Test
	public void test1() {
		int loan = 2000000000;
		int interest = 6000;
		int term = 1;
		assertEquals(671844808, new Mortgage().monthlyPayment(loan, interest, term));
	}
	
	@Test
	public void test2() {
		int loan = 1000000;
		int interest = 1000000;
		int term = 1000;
		assertEquals(988143, new Mortgage().monthlyPayment(loan, interest, term));
	}
	
	@Test
	public void test3() {
		int loan = 1000000;
		int interest = 129;
		int term = 30;
		assertEquals(10868, new Mortgage().monthlyPayment(loan, interest, term));
	}
	
	@Test
	public void test4() {
		int loan = 1999999999;
		int interest = 1000000;
		int term = 1;
		assertEquals(1976284585, new Mortgage().monthlyPayment(loan, interest, term));
	}
}
