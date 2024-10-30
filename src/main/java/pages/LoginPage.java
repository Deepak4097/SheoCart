package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver{
	
	

	
	public static String userName ="usr";
	public static String Password ="pwd";
	public static String loginBtn ="//*[@id=\"second_form\"]/input";
	public static String newUserBtn = "NewRegistration";
	
	
	 public static void sendKeysUserName() throws InterruptedException {
		driver.findElement(By.id(userName)).sendKeys("abc@gmailcom");
		
    }

    public static void sendKeysPassword() throws InterruptedException {
		driver.findElement(By.id(Password)).sendKeys("pwddfjashk");
    } 

    public static void clickLoginBtn() throws InterruptedException {
        driver.findElement(By.xpath(loginBtn)).click();
    } 
    public static void clickNewUserBtn() throws InterruptedException {
        driver.findElement(By.id(newUserBtn)).click();
    } 

}
