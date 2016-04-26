import org.junit.Test;
import static org.junit.Assert.*;

public class AutoLoanTest {
	
	@Test
	public void test0() {
		double price = 6800;
		double monthlyPayment = 100;
		int loanTerm = 68;
		assertEquals(1.3322616182218813E-13, new AutoLoan().interestRate(price, monthlyPayment, loanTerm), 1e-9);
	}
	
	@Test
	public void test1() {
		double price = 2000;
		double monthlyPayment = 510;
		int loanTerm = 4;
		assertEquals(9.56205462458368, new AutoLoan().interestRate(price, monthlyPayment, loanTerm), 1e-9);
	}
	
	@Test
	public void test2() {
		double price = 15000;
		double monthlyPayment = 364;
		int loanTerm = 48;
		assertEquals(7.687856394581649, new AutoLoan().interestRate(price, monthlyPayment, loanTerm), 1e-9);
	}
}
