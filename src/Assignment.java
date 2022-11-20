import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws Exception {
		

		System.setProperty("webdriver.chrome.driver", "C:/Users/swapn/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://profile.w3schools.com/");
		driver.findElement(By.name("email")).sendKeys("swapniltbhagat7@gmail.com");
		driver.findElement(By.name("current-password")).sendKeys("Bacchu@007");
		driver.findElement(By.className("LoginModal_cta_bottom_box_button_login__5Fbwv")).click();
		Thread.sleep(15000);
		driver.findElement(By.className("MainHeader_continueButton__gyOV8")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='root']/div/div[6]/div[2]/div[6]/div[1]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='root']/div/div[6]/div[2]/div[6]/div[2]/div/div/div/div/div[1]")).click();
		
		List<WebElement> Country = driver.findElements(By.cssSelector(".w3-white td:nth-child(3)"));
		
		System.out.println("Number of countries in Country column are " +Country.size());
	}
	}
