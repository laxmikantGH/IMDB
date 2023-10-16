package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.net.MalformedURLException;

public class AutomateCountHyperLinks {
     static void CountHyperLinks() {
        try {
            // Set the path to the ChromeDriver executable (you should download the appropriate version)
            System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");

            // Create a WebDriver instance (open a Chrome browser)
            WebDriver driver = new ChromeDriver();

            // Open the provided URL
            String url = "https://in.bookmyshow.com/explore/home/chennai";
            driver.get(url);

            // Find all the hyperlinks on the page
            List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));

            // Print the count of hyperlinks
            int hyperlinkCount = hyperlinks.size();
            System.out.println("Total hyperlinks on the page: " + hyperlinkCount);

            // Close the browser
            driver.quit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}