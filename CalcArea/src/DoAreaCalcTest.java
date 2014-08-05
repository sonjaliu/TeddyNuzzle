import junit.framework.TestCase;


public class DoAreaCalcTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testRectangle() {
		DoAreaCalc rect= new DoAreaCalc();
		int rectArea=rect.Rectangle(2, 2);
		assertTrue(rectArea==4);
	}

	public void testTriangle() {
		DoAreaCalc tri= new DoAreaCalc();
		int rectArea=tri.Triangle(2, 2);
		assertTrue(rectArea==2);
	}

}
