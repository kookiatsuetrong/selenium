import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

public class Start {
	public static void main(String[] z) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://buddybuyer.com");
		
		Thread.sleep(5000);
		
		WebElement target;
		target = driver.findElement(By.name("query"));
		target.sendKeys("battery");
		Thread.sleep(3000);
		target.submit();
		
		Thread.sleep(10000);
		driver.quit();
	}
}
