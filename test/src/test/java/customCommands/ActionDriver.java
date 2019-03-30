package customCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import configuration.StartBrowser;

public class ActionDriver {
	WebDriver driver;
	
	public ActionDriver(){
		driver = StartBrowser.driver;		
	}
	
	public void launchApplication(String url){
		driver.get(url);			
	}
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void clickOnElement(By elementLocator){
		driver.findElement(elementLocator).click();		
	}
	
	public void typeText(By elementLocator, String text) {
		driver.findElement(elementLocator).clear();
		driver.findElement(elementLocator).sendKeys(text);
		
	}
	
	public String getElementText(By elementLocator) {
		String textCaptured = driver.findElement(elementLocator).getText();
		return textCaptured;	
		
	}
	
	public void mouseHover(By elementLocator, String elementName) {
		Actions a = new Actions(driver);
		WebElement we = driver.findElement(elementLocator);		
		a.moveToElement(we).build().perform();
		
		
	}
	
	public void switchWindow(){
		driver.switchTo().alert();
	}
}
