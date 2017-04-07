import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Gopikiran/Downloads/chromedriver");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		String title=driver.getCurrentUrl();
		System.out.println(title);
		
	}

}
