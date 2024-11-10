package practise;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestCase_4 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   /* int rows = driver.findElements(By.xpath("//table[@id='table1']//tr")).size();
    int cols = driver.findElements(By.xpath("//table[@id='table1']//th")).size();
	for(int i=1;i<rows;i++)
	{
		for(int j=1;j<=cols;j++) {
			String data = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+i+"]//td["+j+"]")).getText();
		   System.out.print(data+"\t");
		}
		System.out.println();
	}
	WebElement fid = driver.findElement(By.xpath("//iframe[@id='iframe1']"));
	driver.switchTo().frame(fid);
	driver.findElement(By.xpath("//table//td[1]//img")).click();
	*/
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='uploadfile']")).sendKeys("C:\\Users\\AMAIR\\Desktop\\java Notes\\arch1.txt");
	
	driver.close();
}

}
