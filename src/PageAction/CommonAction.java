package PageAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	
	public static void clickAllDom(WebDriver driver,WebElement element) throws Exception {
		//获得元素，该元素直接点击会报“element not visible”，所以用js来执行点击事件
//	    WebElement importBtn = driver.findElement(By.xpath(xPath));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", element);
	}

	/**
	 *  获取搜索页 上弹出窗 元素
	 *  条件1 -- 弹出div在 body 下最后
	 *  或者 条件2 -- 弹出div -- div[@x-placement='top-start']
	 *  或者 条件2 -- 弹出div -- div[@x-placement='bottom-start']
	 */
	public static WebElement getSearchPageDialogElement(WebDriver driver, String xPath) {
		if(xPath.startsWith("/html/body/div[")) {
			List<WebElement> elements = driver.findElements(By.xpath("/html/body/div")); 
			xPath = xPath.substring(xPath.indexOf("/","/html/body/div".length()));
			xPath = "/html/body/div[" + elements.size() + "]" + xPath;
		}
		return getElementByXpath(driver, xPath);
	}
	/**
	 * 放弃，查找元素时间太长
	 */
	public static WebElement getSearchPageDialogElementByXplacement(WebDriver driver, String xPath) {
		if(xPath.startsWith("/html/body/div[")) {
			List<WebElement> elements = driver.findElements(By.xpath("/html/body/div[@x-placement='top-start']")); 
			if(elements.size()>0) {
				xPath = xPath.substring(xPath.indexOf("/","/html/body/div".length()));
				xPath = "/html/body/div[@x-placement='top-start']" + xPath;
			}else {
				elements = driver.findElements(By.xpath("/html/body/div[@x-placement='bottom-start']"));
				if(elements.size() == 0) {
					return getElementByXpath(driver, xPath);
				}
				xPath = xPath.substring(xPath.indexOf("/","/html/body/div".length()));
				xPath = "/html/body/div[@x-placement='bottom-start']" + xPath;
			}
		}
		return getElementByXpath(driver, xPath);
	}
	
	/**
	 * 获取body下最后一个div
	 */
	public static WebElement getSearchPageDialogLastDivElement(WebDriver driver) {
		List<WebElement> elements = driver.findElements(By.xpath("/html/body/div")); 
		return elements.get(elements.size()-1);
	}
	
	/**
	 * 省
	 */
	public static WebElement province(WebDriver driver, int i) {
		WebElement lastDivElement = getSearchPageDialogLastDivElement(driver);
		WebElement element = lastDivElement.findElements(By.cssSelector("div.el-cascader-menus ul:nth-of-type(1) li")).get(i);
		return element;
	}
	/**
	 * 市
	 */
	public static WebElement city(WebDriver driver, int j) {
		WebElement lastDivElement = getSearchPageDialogLastDivElement(driver);
		WebElement element = lastDivElement.findElements(By.cssSelector("div.el-cascader-menus ul:nth-of-type(2) li")).get(j);
		return element;
	}
	/**
	 * 点击省/市
	 */
	public static void clickProvinceAndcity(WebDriver driver, int i, int j) throws Exception {
		CommonAction.clickAllDom(driver, CommonAction.province(driver, i));
		CommonAction.clickAllDom(driver, CommonAction.city(driver, j));
	}

}
