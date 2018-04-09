package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;


public class NumberWordsTests {
	private NumberWordsApplication numWords ;
	
	@Before
	public void setup() {
		numWords = new NumberWordsApplication() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numWords.convert(-1)) ;
	}
	
	@Test
	public void Test249()
	{
		int input=249;
		String output = numWords.convert(input);
		
		Assert.assertEquals("Two Hundred Fourty Nine", output);
	}
	
	@Test
	public void Test10()
	{
		int input=10;
		String output = numWords.convert(input);
		
		Assert.assertEquals("Ten", output);
	}
	
	@Test
	public void Test88()
	{
		int input=88;
		String output = numWords.convert(input);
		
		Assert.assertEquals("Eighty Eight", output);
	}

}
