import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RsComponents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\souji\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uk.rs-online.com/web/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".cookie-accept")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".loginName #js-logInOut")).click();
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("RsComponents299");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("pa55w0rd");
		driver.findElement(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Remember me'])[2]/following::button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("All Products")).click();
		driver.findElement(By.linkText("Automation & Control Gear")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='View all 18 categories'])[1]/following::div[2]"))
				.click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contactors'])[2]/following::img[1]"))
				.click();
		driver.findElement(By.xpath(
				"(.//*[normalize-space(text()) and normalize-space(.)='Contactor & Control Relay Overloads'])[1]/span[1]"))
				.click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Units'])[1]/following::div[3]"))
				.click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Units'])[2]/following::div[3]"))
				.click();
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Welcome Tester1'])[1]/following::a[1]"))
				.click();

	}
}
