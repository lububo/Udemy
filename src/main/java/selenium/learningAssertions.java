package selenium;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class learningAssertions {
	@Rule
	public ErrorCollector ec = new ErrorCollector();
	
	@Test
	public void testTitle(){
	String actual_title = "google.com"; // Extract from Selenium
	String expected_title = "google.inc"; // Compare this from Excel sheet

	System.out.println("Initialising comapere");
	try{
	Assert.assertEquals(actual_title, expected_title);
	}catch(Throwable t){
		ec.addError(t);
	}
	System.out.println("Comapere done");

		
	}

}
