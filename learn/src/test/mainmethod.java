package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing is happy");
		
		tes tes = new tes();
		tes.name();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madiwala\\photonspace\\test\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("india");
		driver.findElement(By.name("btnK")).click();
		
		
	}

}
