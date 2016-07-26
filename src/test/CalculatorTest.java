
import org.junit.*;

public class CalculatorTest {

	private Calculator addCal;

	@Test
	public void testAddition() {

		addCal = new Calculator(2,3);
		
		Assert.assertEquals(addCal.getResult(), 5);
	}
}
