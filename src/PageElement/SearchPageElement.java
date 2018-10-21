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
		 //搜索简历栏
		Thread.sleep(2000);
		element= driver.findElements(By.xpath("//li[@class='el-menu-item lh86']")).get(0);       
		 return element;   
		 }
	
	public static WebElement Keyword(WebDriver driver){
		 //关键字      
		 element = driver.findElement(By.cssSelector("input.el-input__inner"));       
		 return element;   
		 }
	public static WebElement Anyey(WebDriver driver){
		 //任一关键字       
		 element = driver.findElements(By.xpath("//span[@class='el-checkbox__label']")).get(0);       
		 return element;   
		 }
	public static WebElement SearchButton(WebDriver driver){
		 //搜索按钮   
		 element = driver.findElements(By.xpath("//button[@class='el-button el-button--default']/span")).get(0);       
		 return element;   
		 }
	public static WebElement CommonSearch(WebDriver driver){
		 //常用搜索  
		 element = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div[1]/div[1]/div[2]/div[2]/div/button/span"));       
		 return element;   
		 }
	public static WebElement IntentionalProfession(WebDriver driver){
		 //意向职业   
		 element = driver.findElement(By.cssSelector("div.cont-div"));       
		 return element;   
		 }
	public static WebElement IntentionalProfession1(WebDriver driver){
		 //意向职业 -1级  
		 element = driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div/div/div[2]/div[4]/div/div[2]/ul/li/ul/li/ul/li[2]"));       
		 return element;   
		 }
	public static WebElement IntentionalProfession2(WebDriver driver){
		 //意向职业-2级   
		 element = driver.findElement(By.xpath("(//button[@type='button'])[13]"));       
		 return element;   
		 }
	
	public static WebElement DesiredPlace(WebDriver driver) throws Exception{
		 //期望工作地   
		Thread.sleep(1000);
		 element = driver.findElement(By.id("expWork"));
		 return element;   
		 }
	
	
	
	
	public static WebElement TenureEnterprise(WebDriver driver){
		 //任职企业  
		 element = driver.findElement(By.xpath("//input[@placeholder='请输入任职企业']"));       
		 return element;   
		 }
	public static WebElement NewestTenureEnterprise(WebDriver driver){
		 //最近任职企业  
		 element = driver.findElement(By.xpath("//input[@placeholder='请输入任职企业']"));       
		 return element;   
		 }
	public static WebElement UpdateTime(WebDriver driver) throws InterruptedException{
		 //更新时间  
		Thread.sleep(1000);
		 element = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div[1]/div[2]/div[1]/div[5]/div[2]/div/input"));       
		 return element;   
		 }
	public static WebElement UpdateTime1(WebDriver driver) throws InterruptedException{
		 //更新时间 1 
		Thread.sleep(1000);
		String xPath = "/html/body/div[2]/div[1]/div[1]/ul/li[4]";
		element = CommonAction.getSearchPageDialogElement(driver, xPath);
		return element;
		 }
	public static WebElement Openbutton(WebDriver driver){
		 //展开
		 element = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div[1]/div[2]/div[1]/div[6]/button/span"));       
		 return element;   
		 }

	public static WebElement IndustryCustom(WebDriver driver){
		 //行业-自定义 
		 element = driver.findElement(By.xpath("//*[@id='industry']/li[2]"));       
		 return element;   
		 }
	public static WebElement IndustryRecent(WebDriver driver) throws Exception{
		 //行业-最近  
		Thread.sleep(2000);
		 element= driver.findElement(By.xpath("//*[@id='industry']/li[3]/label/span[2]"));
		
		//*[@id="industry"]/li[2]
		//div[@class='show-industry-md-ri']
		 //计算机
		return element;  
	 }
	//行业-选择
	public static WebElement IndustryCuston1(WebDriver driver,int i,int j) throws Exception
	{
		//计算机
		Thread.sleep(3000);
		driver.findElements(By.xpath("//div[@class='show-industry-md-ri']")).get(i).click();
		//选择计算机软件
		element=driver.findElements(By.xpath("//ul[@class='show-industry-md-le roll show']/li")).get(j);
		
	    return element;
}
	//行业-选择
		public static WebElement IndustryCustonsure(WebDriver driver) throws Exception
		{
			element=driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/div[1]/div[2]/div[3]/div/div[2]/footer/button[2]/span"));
			return element;
		}
	
	public static WebElement IndustryNolimit(WebDriver driver){
		 //行业-不限   
		 element = driver.findElement(By.xpath(""));       
		 return element;   
		 }
	public static WebElement ExperienceCcustom(WebDriver driver){
			 //经验-自定义   
			 element = driver.findElement(By.xpath(""));       
			 return element;   
			 }
	public static List<WebElement> experience(WebDriver driver){
			 //经验   
			 element2 = driver.findElements(By.xpath("//li[@name='workExp']"));       
			 return element2;   
			 }

	public static WebElement Educationustom(WebDriver driver){
			 //学历-自定义   
			 element = driver.findElement(By.xpath(""));       
			 return element;   
		}
	public static List<WebElement> Education(WebDriver driver){
		 //学历  
		 element2 = driver.findElements(By.xpath("//li[@name='edu']"));       
		 return element2;   
	}
	public static List<WebElement> SalaryExpectation(WebDriver driver){
			 //期望薪资  
			 element2 = driver.findElements(By.xpath("//li[@name='salary']"));       
			 return element2;   
		}
	public static WebElement age(WebDriver driver){
		 //年龄   
		 element = driver.findElement(By.xpath("//input[@placeholder='年龄']"));       
		 return element;   
	}
	public static List<WebElement> age1(WebDriver driver) throws Exception{
		 //年龄   
		Thread.sleep(1000);
		 element2 = driver.findElements(By.xpath("//div[@class='el-select-dropdown el-popper hide-drop-down-empty select-age']/div[1]/div[1]/ul/li"));    
		 return element2;   
	}
	public static WebElement sex(WebDriver driver){
		 //性别按钮
		 element = driver.findElement(By.xpath("//input[@placeholder='性别']"));       
		 return element;   
	}
	public static WebElement sex1(WebDriver driver) throws Exception{
		 //性别  
		Thread.sleep(1000);
		// element = driver.findElement(By.xpath("//div[@class='el-select-dropdown el-popper'and @x-placement='bottom-start' ]/div/div/ul/li[2]"));
		//div[@class='el-select-dropdown el-popper'and @x-placement='bottom-start' ]/div/div/ul/li[2]
		element=CommonAction.getSearchPageDialogElement(driver, "/html/body/div[2]/div[1]/div[1]/ul/li[2]");
		 
		return element;   
	}
	
	
		
	public static WebElement Place(WebDriver driver){
		 //居住地   
		 element = driver.findElement(By.id("nowPlace"));       
		 return element;   
	}

	/**
	 * 户口
	 */
	public static WebElement Registered(WebDriver driver){
		    
		 element = driver.findElement(By.id("nativePlace")); 
		 return element;   
	}
	/**
	 * 工作状态 
	 */
	public static WebElement Jobtatus1(WebDriver driver){
		 element = driver.findElement(By.xpath("//input[@placeholder='求职状态']"));       
		 return element;   
	}
	public static WebElement Jobtatus2(WebDriver driver) throws Exception{
		 //工作状态-在职,不想换
		Thread.sleep(2000);
		
		element=CommonAction.getSearchPageDialogElement(driver,"/html/body/div[2]/div[1]/div[1]/ul/li");
		// element2 = driver.findElements(By.xpath()); 
		 return element;   
	}
	
	public static WebElement School(WebDriver driver){
		 //学校   
		 element = driver.findElement(By.xpath("//input[@placeholder='毕业院校']"));       
		 return element;   
	}
	public static WebElement major(WebDriver driver){
		 //专业  
		 element = driver.findElement(By.xpath("//input[@placeholder='所学专业']"));       
		 return element;   
	}
	
	public static WebElement TemporaryResumes(WebDriver driver){
		 //暂存简历  
		 element = driver.findElements(By.xpath("//button[@class='el-button el-button--default']/span")).get(1);       
		 return element;   
	}
	public static WebElement ViewDetails(WebDriver driver){
		 //查看详情  
		 element = driver.findElements(By.xpath("//button[@class='el-button el-button--default']/span")).get(2);       
		 return element;   
	}
		
}
