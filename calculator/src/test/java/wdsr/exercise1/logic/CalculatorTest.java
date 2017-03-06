package wdsr.exercise1.logic;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testMin_shouldReturnTheOnlyValue() {
		// given
		int[] values = { -5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(values[0], min);
	}
	
	@Test
	public void testMin_shouldReturnTheSmallestOfAllValues() {
		// given
		int[] values = { 2, -3, 5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(-3, min);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForNullArgument() {
		// given
		int[] values = null;
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		int[] values = {};
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}
	
	@Test
	public void testMax_ShouldReturnTheOnlyValue()
	{
		//given
		int[] values = { 12 };
		
		//when
		int max = calculator.max(values);
		
		//then
		assertThat(max, CoreMatchers.is(12));
	}
	
	@Test
	public void testMax_ShouldReturnTheHighestVAlue()
	{
		//given
		int[] values = {0, -5, 6, 10};
		
		//when
		int max = calculator.max(values);
		
		//then
		assertThat(max, CoreMatchers.is(10));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_ShouldRaiseAnExceptionForNullArgument()
	{
		//given
		int[] values = null;
		
		//when
		calculator.max(values);
		
		//then
		//empty
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_ShouldRaiseAnExceptionForEmptyArgument()
	{
		//given
		int[] values = {};
		
		//when
		calculator.max(values);
		
		//then
		//empty
	}
}
