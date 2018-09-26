package measurewithJunit;
import static org.junit.Assert.*;  

import org.junit.Before;
import org.junit.Test;



public class MeasureTest {
	 
	@Before
	public void setUp() throws Exception {

	}

	@SuppressWarnings({ "deprecation", "static-access" })
	@Test
	public void test() {
		measure mea = new measure();	
		assertEquals(20.0, mea.rectangle(5.0,5.0),0.001);
		measure mea2 = new measure();	
		assertEquals(100.0,mea2.square(10),0.001);
		
		}
	}


//if(!mea.rectangle(l, w).equals((double) 100.0)){
//fail("Not yet implemented");
//p = 2*(l+w);
//assertTrue(Asqr = 100);