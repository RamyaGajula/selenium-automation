import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppBox {
	public static void main(String[] args) {
		FirefoxDriver rogers=new FirefoxDriver();
		rogers.get("http://www.box.com");
		WebElement loginbutton=rogers.findElement(By.xpath(".//*[@id='block-usermenu']/ul/li[1]/a"));
		loginbutton.click();
		WebElement emailaddresstextbox=rogers.findElement(By.xpath(".//*[@id='login-form']/div/label[1]/input"));
		emailaddresstextbox.sendKeys("ramyagajula6@gmail.com");
		WebElement passwordtextbox=rogers.findElement(By.xpath(".//*[@id='login-form']/div/label[2]/input"));
		passwordtextbox.sendKeys("Bhuvan008");
		WebElement signinbutton=rogers.findElement(By.xpath(".//*[@id='login-form']/div/div[1]/button"));
		signinbutton.click();
		
		

}
}