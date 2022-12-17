package app_java_6;

import org.junit.Assert;
import org.junit.Test;



public class AddTest {
	@Test
public void addTest() {
	AddNumb a=new AddNumb();
	int actualValue = a.addnumbers(10, 20);
	int expectedValue=30;
	Assert.assertEquals(expectedValue, actualValue);
	
}
}
