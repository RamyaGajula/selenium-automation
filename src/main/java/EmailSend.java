import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailSend {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","/Users/Gopikiran/Downloads/chromedriver");
		
		ChromeDriver gmail=new ChromeDriver();
		gmail.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		gmail.get("http://gmail.com");
		WebElement usernametextbox=gmail.findElement(By.xpath(".//*[@id='Email']"));
		usernametextbox.sendKeys("gajulabhuvan@gmail.com");
		WebElement nextbutton=gmail.findElement(By.xpath(".//*[@id='next']"));
		nextbutton.click();
		WebElement passwordtextbox=gmail.findElement(By.xpath(".//*[@id='Passwd']"));
		passwordtextbox.sendKeys("bhavishya");
		WebElement signinbutton=gmail.findElement(By.xpath(".//*[@id='signIn']"));
		signinbutton.click();
		WebElement composebutton=gmail.findElement(By.xpath(".//*[@id=':3k']/div/div"));
		composebutton.click();
		WebElement totextbox=gmail.findElement(By.xpath(".//*[@id=':8t']"));
		totextbox.sendKeys("yagna.bitspilani@gmail.com");
		WebElement subjecttextbox=gmail.findElement(By.xpath(".//*[@id=':8d']"));
		subjecttextbox.sendKeys("Hi");
		WebElement  messagebody=gmail.findElement(By.xpath(".//*[@id=':9f']"));
		messagebody.sendKeys("My First test mail");
		WebElement sendbutton=gmail.findElement(By.xpath(".//*[@id=':83']"));
		sendbutton.click();
		WebElement accountinformationbutton=gmail.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		accountinformationbutton.click();
		WebElement signoutbutton=gmail.findElement(By.xpath(".//*[@id='gb_71']"));
		signoutbutton.click();
		gmail.quit();
		
		
		
		
		
		
		
	
		
	}

}
