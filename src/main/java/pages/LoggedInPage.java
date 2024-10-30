package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoggedInPage extends BrowserDriver{
	
	
	
	
	public static String productFormalSheo ="//*[text()='Formal Shoes']";
	public static String productSportsSheos ="//*[text()='Sports']";
	public static String productSneakers ="//*[text()='Sneakers']";
	
	 public static void visibilityProductFormalShoes() throws InterruptedException {
		 String actual_product_FormalShoe = driver.findElement(By.xpath(productFormalSheo)).getText();
		 System.out.println(actual_product_FormalShoe);
		 assertEquals("Formal Shoes",actual_product_FormalShoe);
		
    }

    public static void visibilityProductSportsShoes() throws InterruptedException {
    	String actual_product_SportsSheo = driver.findElement(By.xpath(productSportsSheos)).getText();
    	System.out.println(actual_product_SportsSheo);
		 assertEquals("Sports",actual_product_SportsSheo);

    } 

    public static void visibilityProductSneakers() throws InterruptedException {
        String actual_product_sneaker = driver.findElement(By.xpath(productSneakers)).getText();
        System.out.println(actual_product_sneaker);
		 assertEquals("Sneakers",actual_product_sneaker);

    } 

}
