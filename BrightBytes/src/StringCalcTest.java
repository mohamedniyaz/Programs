import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class StringCalcTest {
	
	private StringCalculator StringCalc;
	
	@Before
	public void init(){
		StringCalc = new StringCalculator();
	}
	
    @Test
    public void givenEmptyStringReturnsZero() throws Exception {
        String emptyString = "";
        assertEquals(StringCalc.calculate(emptyString), 0);
    }
    
    @Test
    public void givenSingleNumberReturnsItsValue() throws Exception {
        String singleNumber = "123";
        int valueOfTheNumber = 123;
        assertEquals(StringCalc.calculate(singleNumber), valueOfTheNumber);
    }
    
    @Test
    public void givenPairOfComaSeparatedNumbersReturnTheirSum() throws Exception {
        String pairOfNumbers = "5,13";
        int sumOfNumbers = 5 + 13;
        assertEquals(StringCalc.calculate(pairOfNumbers), sumOfNumbers);
    }
    
}