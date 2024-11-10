package practise;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class TestCase_2 {
public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*WebElement blogs =driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(blogs).perform();
		List<WebElement> text = driver.findElements(By.xpath("//li[@class='has-sub']//ul//span"));
	    for(WebElement t:text) {
	    	System.out.println(t.getText());
	    }*/
		driver.findElement(By.xpath("//a[@id='link1']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id='link2']")).click();
		driver.navigate().back();
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.close();
}
}


