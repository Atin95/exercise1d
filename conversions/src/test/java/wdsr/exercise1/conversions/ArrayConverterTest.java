package wdsr.exercise1.conversions;


import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class ArrayConverterTest 
{
	private ArrayConverter arrayConverter;
	
	@Before
	public void setup()
	{
		arrayConverter = new ArrayConverter();	
	}
	
	@Test
	public void testConvertToInts_ShouldReturnArrayOfInts()
	{
		//given
		String[] strings = {"16", "377", "0"};
		
		//when
		int[] ints = arrayConverter.convertToInts(strings);
		
		//then
		int[] expectedResult = {16, 377, 0};
		assertThat(ints, CoreMatchers.is(expectedResult));
	}
	
	@Test(expected=NullPointerException.class)
	public void testConvertToInts_ShouldRaiseExceptionForNullArgument()
	{
		//given
		String[] strings = null;
		
		//when
		arrayConverter.convertToInts(strings);
		
		//then
		//empty
	}
	
	@Test(expected=NumberFormatException.class)
	public void testConvertToInts_ShouldRaiseExceptionForNotIntegerValue()
	{
		//given
		String[] strings = {"13.5"};
		
		//when
		arrayConverter.convertToInts(strings);
		
		//then
		//empty
	}
}
