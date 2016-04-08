package selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class testingJunit {
	
	public static boolean ValidateLink(){
		return false;
	}
	
	@BeforeClass
	public static void SeleniuSetup(){
		System.out.println("Initialising selenium");
		Assume.assumeTrue(ValidateLink());
	}
	
	@Before	
	public void testOpenBrowser(){
		System.out.println("testOpen Firefox Browser");
	}
	
	@Test	
	public void testNvigation(){
		System.out.println("Opening the website");
			}
	
	@Test	
	public void testLogInDetails(){
		System.out.println("enter login");
	}
	
	@After
	public void closingBrowser(){
		System.out.println("Closing browser");
	}
	@AfterClass
	public static void SeleniuShutdown(){
		System.out.println("Shutdown selenium");
	}

}
