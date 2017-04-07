import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAccount {
	public static void main(String[] args) {
	    FirefoxDriver gopikiran=new FirefoxDriver();
		gopikiran.get("https://www.amazon.ca");
		WebElement youraccountbutton=gopikiran.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));
		youraccountbutton.click();
		WebElement emailaddresstextbox=gopikiran.findElement(By.xpath(".//*[@id='ap_email']"));
		emailaddresstextbox.sendKeys("gkgajula@gmail.com");
		WebElement passwordtextbox=gopikiran.findElement(By.xpath(".//*[@id='ap_password']"));
		passwordtextbox.sendKeys("bhuvan008");
		WebElement signinbutton=gopikiran.findElement(By.xpath(".//*[@id='signInSubmit']"));
		signinbutton.click();
		WebElement searchtextbox=gopikiran.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		searchtextbox.sendKeys("macbok air 13 inch");
		WebElement searchbutton=gopikiran.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		searchbutton.click();
		WebElement youraccountsbutton=gopikiran.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"));
		youraccountbutton.click();
		WebElement signoutbutton=gopikiran.findElement(By.xpath(".//*[@id='nav-item-signout']/span"));
		signoutbutton.click();
		
	
			
		
				
		
		
	}

}
