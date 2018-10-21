package PageAction;

import org.openqa.selenium.WebDriver;

import PageElement.LoginElement;

public class LoginAction {
	
	//1�����췽���ķ�����������������ͬ��  
	//2�����췽��û�з������ͣ�Ҳ���ܶ���Ϊvoid���ڷ�����ǰ�治�����������͡�
	//3�����췽������Ҫ��������ɶ���ĳ�ʼ�����������ܹ��Ѷ������ʱ�Ĳ�������������� 
	private static WebDriver driver;  
	//1�����췽���ķ�����������������ͬ��  
	//2�����췽��û�з������ͣ�Ҳ���ܶ���Ϊvoid���ڷ�����ǰ�治�����������͡�
	//3�����췽������Ҫ��������ɶ���ĳ�ʼ�����������ܹ��Ѷ������ʱ�Ĳ�������������� 
	public LoginAction(WebDriver driver){      
		this.driver = driver;   
		}       
	public void Login(String user,String pw) throws Exception 
	{       
		LoginElement.userName(driver).sendKeys(user);      
		LoginElement.userPass(driver).sendKeys(pw);      
		LoginElement.loginButton(driver).click();   
		
	} 
	public void freeRegistration() {
		LoginElement.FreeRegistration(driver).click();
		
	}
	public void ForgetPassword() {
		LoginElement.ForgetPassword(driver).click();
		
	}
	
	 //����driver
    public WebDriver ReturnDriver(){
        return this.driver;
    }
}
