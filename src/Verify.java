import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchVerification {
    public static void main(String[] args) {
        // Automatically setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the target website
        driver.get("https://www.example.com"); // Change to the actual website URL

        // Define locators for the search textbox and button (Change based on actual webpage)
        By searchBoxLocator = By.name("q");  // Example: Google search box
        By searchButtonLocator = By.name("btnK");  // Example: Google search button

        // Verify search textbox
        WebElement searchBox = driver.findElement(searchBoxLocator);
        if (searchBox.isDisplayed() && searchBox.isEnabled()) {
            System.out.println("Search textbox is present and enabled.");
        } else {
            System.out.println("Search textbox is NOT present or not enabled.");
        }

        // Verify search button
        WebElement searchButton = driver.findElement(searchButtonLocator);
        if (searchButton.isDisplayed() && searchButton.isEnabled()) {
            System.out.println("Search button is present and enabled.");
        } else {
            System.out.println("Search button is NOT present or not enabled.");
        }

        // Close the browser
        driver.quit();
    }
}