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
		//���Ԫ�أ���Ԫ��ֱ�ӵ���ᱨ��element not visible����������js��ִ�е���¼�
//	    WebElement importBtn = driver.findElement(By.xpath(xPath));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()", element);
	}

	/**
	 *  ��ȡ����ҳ �ϵ����� Ԫ��
	 *  ����1 -- ����div�� body �����
	 *  ���� ����2 -- ����div -- div[@x-placement='top-start']
	 *  ���� ����2 -- ����div -- div[@x-placement='bottom-start']
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
	 * ����������Ԫ��ʱ��̫��
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
	 * ��ȡbody�����һ��div
	 */
	public static WebElement getSearchPageDialogLastDivElement(WebDriver driver) {
		List<WebElement> elements = driver.findElements(By.xpath("/html/body/div")); 
		return elements.get(elements.size()-1);
	}
	
	/**
	 * ʡ
	 */
	public static WebElement province(WebDriver driver, int i) {
		WebElement lastDivElement = getSearchPageDialogLastDivElement(driver);
		WebElement element = lastDivElement.findElements(By.cssSelector("div.el-cascader-menus ul:nth-of-type(1) li")).get(i);
		return element;
	}
	/**
	 * ��
	 */
	public static WebElement city(WebDriver driver, int j) {
		WebElement lastDivElement = getSearchPageDialogLastDivElement(driver);
		WebElement element = lastDivElement.findElements(By.cssSelector("div.el-cascader-menus ul:nth-of-type(2) li")).get(j);
		return element;
	}
	/**
	 * ���ʡ/��
	 */
	public static void clickProvinceAndcity(WebDriver driver, int i, int j) throws Exception {
		CommonAction.clickAllDom(driver, CommonAction.province(driver, i));
		CommonAction.clickAllDom(driver, CommonAction.city(driver, j));
	}

}
