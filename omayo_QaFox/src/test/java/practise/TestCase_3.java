package practise;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TestCase_3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
       /* WebElement opts = driver.findElement(By.xpath("//select[@class='combobox']"));
        Select s1 = new Select(opts);
        s1.selectByValue("def");
        List<WebElement> allopts = s1.getOptions();
        for(WebElement e:allopts) {
        	System.out.println(e.getText());
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='radio1']")).click();
        
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//input[@id='alert1']")).click();
	    Alert a1 = driver.switchTo().alert();
	    a1.accept();
	    Thread.sleep(5000);
	    WebElement orange=driver.findElement(By.xpath("//input[@value='blue']"));
        if(orange.isSelected()==false) {
        	orange.click();
        }*/
        String value = driver.findElement(By.xpath("//input[@id='rotb']")).getAttribute("value");
        System.out.println(value);
        driver.findElement(By.xpath("//input[@id='prompt']")).click();
	    Thread.sleep(5000);
        Alert a1 = driver.switchTo().alert();
        a1.sendKeys("testing");
        a1.accept();
	    driver.close();
	}

}
