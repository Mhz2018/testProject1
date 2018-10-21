package PageTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageAction.LoginAction;
import PageAction.SearchPageAction;

public class Search {
	 private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
		public void runBeforClass() throws Exception {		  	
		 // 
		    driver = new FirefoxDriver();
//		  System.setProperty("webdriver.chrome.driver","E:\\webDriver\\chromedriverV2.28.exe");//chromedriver�����ַ
//	        WebDriver driver =new ChromeDriver(); //�½�һ��WebDriver �Ķ��󣬵���new ����FirefoxDriver������
		    baseUrl = "http://web.ailiegou.com/"; 
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    driver.get(baseUrl);
		    driver.manage().window().maximize();
	 
	  }
	  @Test
	  public void login() throws Exception {
	    //��¼
	      Thread.sleep(1000);
		  LoginAction la = new LoginAction(driver);
	      //�����û���������
	      la.Login("2015069736@qq.com", "123456"); 
	       Thread.sleep(2000);
	      SearchPageAction.Searchitem(driver,2,3,"����");
	      SearchPageAction.SearchExpansion(driver, 3, 4, 3, 4, 1);
	      SearchPageAction.SearchOther(driver, 5, 2, 2, "����", "�����");
	      
	  }
	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	   // driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  
	  }
}
