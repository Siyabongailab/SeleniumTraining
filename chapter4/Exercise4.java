package chapter4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Exercise4{

    public static void main(String[] args) {
        // Start the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // Open the test website
            driver.get("https://the-internet.herokuapp.com/");
            System.out.println("Opened homepage.");

            // Verify 'Available Examples' is visible
            WebElement availableExamples = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Available Examples']")));
            System.out.println("Verified: " + availableExamples.getText());

            // Click on 'Dynamic Loading'
            driver.findElement(By.linkText("Dynamic Loading")).click();
            System.out.println("Opened Dynamic Loading page.");

            // Verify 'Dynamically Loaded Page Elements' is visible
            WebElement dynamicLoadingHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h3")));
            System.out.println("Verified: " + dynamicLoadingHeader.getText());

            // Click on 'Example 1'
            driver.findElement(By.partialLinkText("Example 1")).click();
            System.out.println("Opened Example 1 page.");

            // Verify 'Example 1: Element on Page that is hidden' is visible
            WebElement exampleHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h4")));
            System.out.println("Verified: " + exampleHeader.getText());

            // Click 'Start' button
            driver.findElement(By.tagName("button")).click();
            System.out.println("Started loading...");

            // Wait for 'Hello World!' to appear
            WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
            System.out.println("Verified: " + textElement.getText());
        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}





