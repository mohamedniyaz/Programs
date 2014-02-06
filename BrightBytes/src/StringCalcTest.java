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

    @Test
    public void givenMoreThanTwoComaSeparatedNumbersReturnsTheirSum() throws Exception {
        String manyNumbers = "1,2,3,4";
        int sumOfManyNumbers = 1 + 2 + 3 + 4;
        assertEquals(StringCalc.calculate(manyNumbers), sumOfManyNumbers);
    }
    
    @Test
    public void allowsUsingNewLinesAsSeparators() throws Exception {
        String numbersSeparatedWithNewLines = "3\n4\n6";
        int sumOfNumbers = 3 + 4 + 6;
        assertEquals(StringCalc.calculate(numbersSeparatedWithNewLines), sumOfNumbers);
    }
    
    @Test
    public void allowsMixingComasOrNewLinesAsSeparators() throws Exception {
        String numbersSeparatedWithNewLinesAndCommas = "2,3\n4";
        int sumOfNumbers = 2 + 3 + 4;
        assertEquals(StringCalc.calculate(numbersSeparatedWithNewLinesAndCommas), sumOfNumbers);
    }
    
    @Test
    public void usesCustomSeparatorDefinedInFirstLineOfInput() throws Exception {
        String numbersWithCustomSeparator = "//;\n5;6;8";
        int sumOfNumbers = 5 + 6 + 8;
        assertEquals(StringCalc.calculate(numbersWithCustomSeparator), sumOfNumbers);
    }
    
    @Test
    public void givenCustomSeparatorButNoNumbersReturnsZero() throws Exception {
        String customSeparatorWithNoNumbers = "//;\n";
        assertEquals(StringCalc.calculate(customSeparatorWithNoNumbers), 0);
    }
    
    @Test
    public void givenCustomSeparatorButJustOneNumberReturnsThatNumberValue() throws Exception {
        String customSeparatorWithNoNumbers = "//;\n9";
        assertEquals(StringCalc.calculate(customSeparatorWithNoNumbers), 9);
    }
    
    @Test
    public void regexSpecialCharactersCanBeSeparatorsToo() throws Exception {
        String dotSeparatedNumbers = "//.\n17.18";
        assertEquals(StringCalc.calculate(dotSeparatedNumbers), 17 + 18);
    }
    
}