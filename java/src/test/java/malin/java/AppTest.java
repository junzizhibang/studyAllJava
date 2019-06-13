package malin.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	
	/**
	*@功能描述        
	*@作者      马琳-脚踏实地积累。Java进阶
	*@email    1217575485@qq.com
	*/
	 
	private void maintest() {
		System.out.println("   --------");
	}
	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
		maintest();
	}
}
