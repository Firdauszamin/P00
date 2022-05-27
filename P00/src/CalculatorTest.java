import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21035358, 27 May 2022 11:21:37 am
 */

/**
 * @author 21035358
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		    
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testadd() {
		int a = 1234;
		int b = 8765;
			
			Calculator cal = new Calculator();
			int actual = cal.add(a,b);
			
			int expected = 9999;
			assertEquals (expected,actual);
			//assertTrue will return a boolean value.
	}
	
	@Test
	public final void testSubtract() {
		
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a ,b);
		int expected = 5555;
		
		
		assertEquals(actual, expected);
		
		
	}
	
	@Test
	public void testMultiply() {
		
		
		int a = 12;
		int b = 12;
		
		Calculator cal = new Calculator();
		
		int actual = cal.multiple(a, b);
				
		
		int expected = 144;
		
		assertEquals(actual,expected);
		
		
	}
	@Test
	public void testDivide() {
		int a = 60;
		int b = 12;
		
		Calculator cal = new Calculator();
		
		int actual = cal.divide(a,b);
		
		int expected = 5;
		
		assertEquals(actual,expected);
	}

	}