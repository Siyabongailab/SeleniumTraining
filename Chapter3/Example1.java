package Chapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            validLogins();
        } finally {
            // Ensure browser closes even if an exception occurs
            driver.quit();
        }
    }

    static void validLogins() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //Thread.sleep(3000);

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        Thread.sleep(5000);

        try {
            WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));

            if (dashboard.isDisplayed()) {
                System.out.println("Login successful! Dashboard is visible.");
            } else {
                System.out.println("Login failed! Dashboard not found.");
            }
        } catch (Exception e) {
            System.out.println("Login failed! Exception occurred: " + e.getMessage());
        }
    }


    static void invalidPassword() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Wait for page to load
        Thread.sleep(3000);

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin126");
        Thread.sleep(2000);

        // Click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Wait for the dashboard to load
        Thread.sleep(5000);

        // Verify if dashboard is displayed
        try {
            WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));

            if (dashboard.isDisplayed()) {
                System.out.println("Login successful! Dashboard is visible.");
            } else {
                System.out.println("Login failed! Dashboard not found.");
            }
        } catch (Exception e) {
            System.out.println("Login failed! Exception occurred: " + e.getMessage());
        }

    }


    static void invalidUserName() throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Wait for page to load
        Thread.sleep(3000);

        // Enter valid username
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin5");
        Thread.sleep(2000);

        // Enter valid password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        Thread.sleep(2000);

        // Click on login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        // Wait for the dashboard to load
        Thread.sleep(5000);

        // Verify if dashboard is displayed
        try {
            WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));

            if (dashboard.isDisplayed()) {
                System.out.println("Login successful! Dashboard is visible.");
            } else {
                System.out.println("Login failed! Dashboard not found.");
            }
        } catch (Exception e) {
            System.out.println("Login failed! Exception occurred: " + e.getMessage());
        }

    }

}


