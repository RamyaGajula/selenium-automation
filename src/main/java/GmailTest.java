import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		WebElement usernametextbox=driver.findElement(By.xpath(".//*[@id='Email']"));
		usernametextbox.sendKeys("gajulabhuvan@gmail.com");
		WebElement nextbutton=driver.findElement(By.xpath(".//*[@id='next']"));
		nextbutton.click();
		WebElement passwordtextbox=driver.findElement(By.xpath(".//*[@id='Passwd']"));
		passwordtextbox.sendKeys("bhavishya");
		WebElement signinbutton=driver.findElement(By.xpath(".//*[@id='signIn']"));
		signinbutton.click();
//		driver.quit();
		
	}

}
