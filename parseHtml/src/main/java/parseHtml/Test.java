package parseHtml;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","D:/Program/chromedriver.exe");
//		  WebDriver chromedriver = new ChromeDriver();
		  
		  WebDriver htmlUnitDriver = new HtmlUnitDriver(true);
		  testDriver(htmlUnitDriver);
//		  testDriver(chromedriver);
		  

	}

	public static void testDriver(WebDriver driver){
		driver.get("http://item.jd.com/1013815.html");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.xpath("//*[@id=\"jd-price\"]"));

        // Enter something to search for
//        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
//        element.submit();

        // Check the title of the page
//        System.out.println("Page title is: " + driver.getTitle());
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().toLowerCase().startsWith("cheese!");
//            }
//        });
        System.out.println("获得的价钱"+element.getText());
        // Should see: "cheese! - Google Search"
        System.out.println(driver.getClass().getSimpleName()+"------Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
	}
}
