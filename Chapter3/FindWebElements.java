package Chapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindWebElements {
    static  WebDriver driver;
    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

         accessById();
         accessByName();
         accessByAbsoluteXpath();
        driver.quit();
    }

    static void accessById(){
        try{

            WebElement txtName = driver.findElement(By.id("name"));
            display(txtName);

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

    }
    static void accessByName(){
        WebElement txtName = driver.findElement(By.name("email"));
        display(txtName);

    }
    static void accessByCss(){

        WebElement cssValue = driver.findElement(By.cssSelector("input[id = 'name']"));
        display(cssValue);
    }
static void accessByAbsoluteXpath(){

        //:/html/body/main/div/div[1]/div[2]/form/div[4]/div/input
    WebElement txtMobile = driver.findElement(By.xpath(
  "/html/body/main/div/div[1]/div[2]/form/div[4]/div/input"
    ));

    display(txtMobile);

}
    static void accessByRelativeXpath(){



    }



    static void display(WebElement element){
        System.out.println("_____________________________");
        //System.out.println("Tag name: " + element.);
        System.out.println("Tag name: " + element.getTagName());
        System.out.println("Text: "+ element.getText());
    }



}
