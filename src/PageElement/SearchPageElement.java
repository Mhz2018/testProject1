package PageElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageAction.CommonAction;

public class SearchPageElement {
	private static WebElement element,element1;
	private static List<WebElement> element2;
	
	public static WebElement SearchList(WebDriver driver) throws InterruptedException{
		 //����������
		Thread.sleep(2000);
		element= driver.findElements(By.xpath("//li[@class='el-menu-item lh86']")).get(0);       
		 return element;   
		 }
	
	public static WebElement Keyword(WebDriver driver){
		 //�ؼ���      
		 element = driver.findElement(By.cssSelector("input.el-input__inner"));       
		 return element;   
		 }
	public static WebElement Anyey(WebDriver driver){
		 //��һ�ؼ���       
		 element = driver.findElements(By.xpath("//span[@class='el-checkbox__label']")).get(0);       
		 return element;   
		 }
	public static WebElement SearchButton(WebDriver driver){
		 //������ť   
		 element = driver.findElements(By.xpath("//button[@class='el-button el-button--default']/span")).get(0);       
		 return element;   
		 }
	public static WebElement CommonSearch(WebDriver driver){
		 //��������  
		 element = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div[1]/div[1]/div[2]/div[2]/div/button/span"));       
		 return element;   
		 }
	public static WebElement IntentionalProfession(WebDriver driver){
		 //����ְҵ   
		 element = driver.findElement(By.cssSelector("div.cont-div"));       
		 return element;   
		 }
	public static WebElement IntentionalProfession1(WebDriver driver){
		 //����ְҵ -1��  
		 element = driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div/div/div[2]/div[4]/div/div[2]/ul/li/ul/li/ul/li[2]"));       
		 return element;   
		 }
	public static WebElement IntentionalProfession2(WebDriver driver){
		 //����ְҵ-2��   
		 element = driver.findElement(By.xpath("(//button[@type='button'])[13]"));       
		 return element;   
		 }
	
	public static WebElement DesiredPlace(WebDriver driver) throws Exception{
		 //����������   
		Thread.sleep(1000);
		 element = driver.findElement(By.id("expWork"));
		 return element;   
		 }
	
	
	
	
	public static WebElement TenureEnterprise(WebDriver driver){
		 //��ְ��ҵ  
		 element = driver.findElement(By.xpath("//input[@placeholder='��������ְ��ҵ']"));       
		 return element;   
		 }
	public static WebElement NewestTenureEnterprise(WebDriver driver){
		 //�����ְ��ҵ  
		 element = driver.findElement(By.xpath("//input[@placeholder='��������ְ��ҵ']"));       
		 return element;   
		 }
	public static WebElement UpdateTime(WebDriver driver) throws InterruptedException{
		 //����ʱ��  
		Thread.sleep(1000);
		 element = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/div[2]/div/input"));       
		 return element;   
		 }
	public static WebElement UpdateTime1(WebDriver driver) throws InterruptedException{
		 //����ʱ�� 1 
		Thread.sleep(1000);
		String xPath = "/html/body/div[2]/div[1]/div[1]/ul/li[4]";
		element = CommonAction.getSearchPageDialogElement(driver, xPath);
		return element;
		 }
	public static WebElement Openbutton(WebDriver driver){
		 //չ��
		 element = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div[1]/div[2]/div[1]/div[6]/button/span"));       
		 return element;   
		 }

	public static WebElement IndustryCustom(WebDriver driver){
		 //��ҵ-�Զ��� 
		 element = driver.findElement(By.xpath("//*[@id='industry']/li[2]"));       
		 return element;   
		 }
	public static WebElement IndustryRecent(WebDriver driver) throws Exception{
		 //��ҵ-���  
		Thread.sleep(2000);
		 element= driver.findElement(By.xpath("//*[@id='industry']/li[3]/label/span[2]"));
		
		//*[@id="industry"]/li[2]
		//div[@class='show-industry-md-ri']
		 //�����
		return element;  
	 }
	//��ҵ-ѡ��
	public static WebElement IndustryCuston1(WebDriver driver,int i,int j) throws Exception
	{
		//�����
		Thread.sleep(3000);
		driver.findElements(By.xpath("//div[@class='show-industry-md-ri']")).get(i).click();
		//ѡ���������
		element=driver.findElements(By.xpath("//ul[@class='show-industry-md-le roll show']/li")).get(j);
		
	    return element;
}
	//��ҵ-ѡ��
		public static WebElement IndustryCustonsure(WebDriver driver) throws Exception
		{
			element=driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div[1]/div[2]/div[3]/div/div[2]/footer/button[2]/span"));
			return element;
		}
	
	public static WebElement IndustryNolimit(WebDriver driver){
		 //��ҵ-����   
		 element = driver.findElement(By.xpath(""));       
		 return element;   
		 }
	public static WebElement ExperienceCcustom(WebDriver driver){
			 //����-�Զ���   
			 element = driver.findElement(By.xpath(""));       
			 return element;   
			 }
	public static List<WebElement> experience(WebDriver driver){
			 //����   
			 element2 = driver.findElements(By.xpath("//li[@name='workExp']"));       
			 return element2;   
			 }

	public static WebElement Educationustom(WebDriver driver){
			 //ѧ��-�Զ���   
			 element = driver.findElement(By.xpath(""));       
			 return element;   
		}
	public static List<WebElement> Education(WebDriver driver){
		 //ѧ��  
		 element2 = driver.findElements(By.xpath("//li[@name='edu']"));       
		 return element2;   
	}
	public static List<WebElement> SalaryExpectation(WebDriver driver){
			 //����н��  
			 element2 = driver.findElements(By.xpath("//li[@name='salary']"));       
			 return element2;   
		}
	public static WebElement age(WebDriver driver){
		 //����   
		 element = driver.findElement(By.xpath("//input[@placeholder='����']"));       
		 return element;   
	}
	public static List<WebElement> age1(WebDriver driver) throws Exception{
		 //����   
		Thread.sleep(1000);
		 element2 = driver.findElements(By.xpath("//div[@class='el-select-dropdown el-popper hide-drop-down-empty select-age']/div[1]/div[1]/ul/li"));    
		 return element2;   
	}
	public static WebElement sex(WebDriver driver){
		 //�Ա�ť
		 element = driver.findElement(By.xpath("//input[@placeholder='�Ա�']"));       
		 return element;   
	}
	public static WebElement sex1(WebDriver driver) throws Exception{
		 //�Ա�  
		Thread.sleep(1000);
		// element = driver.findElement(By.xpath("//div[@class='el-select-dropdown el-popper'and @x-placement='bottom-start' ]/div/div/ul/li[2]"));
		//div[@class='el-select-dropdown el-popper'and @x-placement='bottom-start' ]/div/div/ul/li[2]
		element=CommonAction.getSearchPageDialogElement(driver, "/html/body/div[2]/div[1]/div[1]/ul/li[2]");
		 
		return element;   
	}
	
	
		
	public static WebElement Place(WebDriver driver){
		 //��ס��   
		 element = driver.findElement(By.id("nowPlace"));       
		 return element;   
	}

	/**
	 * ����
	 */
	public static WebElement Registered(WebDriver driver){
		    
		 element = driver.findElement(By.id("nativePlace")); 
		 return element;   
	}
	/**
	 * ����״̬ 
	 */
	public static WebElement Jobtatus1(WebDriver driver){
		 element = driver.findElement(By.xpath("//input[@placeholder='��ְ״̬']"));       
		 return element;   
	}
	public static WebElement Jobtatus2(WebDriver driver) throws Exception{
		 //����״̬-��ְ,���뻻
		Thread.sleep(2000);
		
		element=CommonAction.getSearchPageDialogElement(driver,"/html/body/div[2]/div[1]/div[1]/ul/li");
		// element2 = driver.findElements(By.xpath()); 
		 return element;   
	}
	
	public static WebElement School(WebDriver driver){
		 //ѧУ   
		 element = driver.findElement(By.xpath("//input[@placeholder='��ҵԺУ']"));       
		 return element;   
	}
	public static WebElement major(WebDriver driver){
		 //רҵ  
		 element = driver.findElement(By.xpath("//input[@placeholder='��ѧרҵ']"));       
		 return element;   
	}
	
	public static WebElement TemporaryResumes(WebDriver driver){
		 //�ݴ����  
		 element = driver.findElements(By.xpath("//button[@class='el-button el-button--default']/span")).get(1);       
		 return element;   
	}
	public static WebElement ViewDetails(WebDriver driver){
		 //�鿴����  
		 element = driver.findElements(By.xpath("//button[@class='el-button el-button--default']/span")).get(2);       
		 return element;   
	}
		
}
