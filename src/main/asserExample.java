package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.Desktop.Action;

import org.junit.Assert;  

public class asserExample {

	public static void main(String[] args) throws InterruptedException   
    {  
 // TODO Auto-generated method stub  
 System.setProperty("webdriver.chrome.driver","../drag&drop/drivers/chromedriver.exe");  
 WebDriver driver = new ChromeDriver();  
 driver.navigate().to("http://demo.automationtesting.in/Register.html");  
 
 WebElement right_click = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
 Actions action = new Actions(driver);
 Thread.sleep(25000);
 action.contextClick(right_click).perform();
 Thread.sleep(5000);
 /*WebElement Interaction = driver.findElement(By.xpath("//a[contains(text(),'Interactions')] "));
 Actions act = new Actions(driver);
 Thread.sleep(2000);
 act.moveToElement(Interaction);
 Thread.sleep(2000);
 act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop ')] ")));
 Thread.sleep(2000);
 act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Static ')]  ")));
 Thread.sleep(2000);
 
 
 
 Interaction.click();
 driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop ')]")).click();
 driver.findElement(By.xpath("//a[contains(text(),'Static ')] ")).click();
 Actions act = new Actions(driver);
WebElement fromwebElement = driver.findElement(By.xpath("//img[@id='angular']"));
WebElement towebElement = driver.findElement(By.xpath("//div[@id='droparea']"));
Actions dragnDrop = act.clickAndHold(fromwebElement);
act.moveToElement(towebElement);
act.release(towebElement);
act.build();
Thread.sleep(3000);
dragnDrop.perform();
Thread.sleep(3000);
System.out.println("item dragged successfully");*/
 driver.close();
   
}
}
