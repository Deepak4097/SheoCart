package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class HomePage extends BrowserDriver {
	

	
	public static String hamburgerMenuXpath ="//*[@id=\"menuToggle\"]/input";
	public static String signInPortalLinkText ="Sign In Portal";
	public static String onlineProductLinkText ="Online Products";
	
	public static void clickHamburgerMenu() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburgerMenuXpath)).click();
    }

    public static void clickSignInLink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signInPortalLinkText)).click();
    }
    public static void clickOnlineProductLink() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(onlineProductLinkText)).click();
    }
}
