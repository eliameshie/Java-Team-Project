import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

public class TestCases{
   @Test
	public void Power() {
		CodeToTest tst1 = new CodeToTest();
		double output_mul=tst2.power(5, 2);
		assertEquals(25,output_mul,0.01);
		} 
  @Test
	public void multiply() {
		CodeToTest tst2 = new CodeToTest();
		double output_mul=tst2.Multiply(10, 2);
		assertEquals(20,output_mul,0.01);
		}
  @Test
	public void intDivision() {
		CodeToTest tst3 = new CodeToTest();
		double output_div=tst2.Divide(10, 2);
		assertEquals(5,output_div,0.01);
		}
