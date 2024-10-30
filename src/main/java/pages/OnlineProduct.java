package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import utility.BrowserDriver;

public class OnlineProduct extends BrowserDriver {
	
	public static String onlineProductFormalSheos = "/html/body/div[2]/center/div/i[1]";
	
	public static String productFormalSheoTable="/html/body/div[2]/table/tbody/tr[1]/td[1]";
	
	public static void clickOnlineProductFormalSheosDropdown() throws InterruptedException {
        driver.findElement(By.xpath(onlineProductFormalSheos)).click();


}
	
	public static void visibilityFormalSheoName() throws InterruptedException {
    	String actual_FormalSheoName = driver.findElement(By.xpath(productFormalSheoTable)).getText();
    	System.out.println(actual_FormalSheoName);
		 assertEquals("   Classic Cheltenham",actual_FormalSheoName);


}
}
  // 
