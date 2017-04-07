import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		WebElement emailtextbox=driver.findElement(By.xpath(".//*[@id='email']"));
		emailtextbox.sendKeys("ramyachikki@gmail.com");
		WebElement passwordtextbox=driver.findElement(By.xpath(".//*[@id='pass']"));
		passwordtextbox.sendKeys("energy");
		Thread.sleep(5000);
		WebElement loginbutton=driver.findElement(By.xpath(".//*[@id='u_0_u']"));
		loginbutton.click();
		
		
		
	}

}
