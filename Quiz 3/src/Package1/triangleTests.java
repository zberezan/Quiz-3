package Package1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class triangleTests {
	static Triangle a;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		a = new Triangle(3,4,5);

	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Test() {
		assertTrue(a.getArea()==6);
		assertTrue(a.getPerimeter()== 12);
		a = new Triangle(12.2,24,21.8);
		assertTrue(a.getArea()==132.43);
		assertTrue(a.getPerimeter()== 58);
		a = new Triangle(18.7,51.7,40.4);
		assertTrue(a.getArea()==335.91);
		assertTrue(a.getPerimeter()== 110.8);
		a = new Triangle(15,23,10);
		assertTrue(a.getArea()==54.99);
		assertTrue(a.getPerimeter()== 48);
	
	
	
	}
	
	
}
