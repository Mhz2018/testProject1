package PageTests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageAction.CommonAction;
import PageAction.LoginAction;
import PageAction.RegisterAction;
import PageElement.CommonElement;
import PageElement.RegisterElement;

public class Register {
	/*
	 * class �� -- ����ĸ��д ���磺public class Register��
	 * ���� �� -- ����ĸСд ���磺public void runBeforClass()��
	 * ���� �� -- ����ĸСд���磺private boolean acceptNextAlert��
	 */
	private WebDriver driver;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void runBeforClass() throws Exception {
//		    driver = new FirefoxDriver();
//		    baseUrl = CommonElement.baseUrl; 
//		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		    driver.get(baseUrl);
//		    driver.manage().window().maximize();
		driver = CommonAction.openFirefox();
	}

	@Test
	public void register() throws Exception {
		// ��¼
		Thread.sleep(1000);
		LoginAction la = new LoginAction(driver);
		la.freeRegistration();
		Thread.sleep(2000);
		RegisterAction la2 = new RegisterAction(driver);

		// �����û���������
		la2.register();
		la2.click();
		Thread.sleep(2000);
		// ���Ե�¼�ɹ�
		assertEquals(RegisterElement.messageBox(driver).getText(),
				"�Ѿ�ע��ɹ���������Ժ��͵��������䣬�����ĵȴ���");
		System.out.println("�ѷ��ͣ�ע�����");
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
