package mavenPackage;


import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestngTest {

	@Test
	public void testmethod() throws AWTException {

		WebDriver driver;

		String driverPath = "C:\\Users\\psekar\\Downloads\\Selenium\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();

		driver.get("https://images.google.com/");

		driver.manage().window().maximize();

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);

		System.out.println("Completed Execution");
	}
}
