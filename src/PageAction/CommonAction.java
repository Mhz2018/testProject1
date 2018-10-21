package PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageElement.CommonElement;

public class CommonAction {

	public static WebDriver openFirefox() {
		WebDriver driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(CommonElement.baseUrl);
	    driver.manage().window().maximize();
		return null;
	}

	public static WebElement getElementByXpath(WebDriver driver, String xPath) {
		return driver.findElement(By.xpath(xPath));
	}
	
	public static WebElement getElementByCss(WebDriver driver, String css) {
		return driver.findElement(By.cssSelector(css));
	}

}
