package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import utility.BrowserDriver;

public class Registration extends BrowserDriver{
	
	public static String userRegistrationPageHeader ="/html/body/center/h1";

	
	public static void visibilityUserRegistrationPageHeader() throws InterruptedException {
    	String actual_UserRegistrationHeadig = driver.findElement(By.xpath(userRegistrationPageHeader)).getText();
    	System.out.println(actual_UserRegistrationHeadig);
		 assertEquals("User Registration Page",actual_UserRegistrationHeadig);


}
}