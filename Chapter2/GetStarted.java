package Chapter2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetStarted {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();

        System.out.println("Title: "+ driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());


        driver.get("https://www.ilabquality.com/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        display(driver);



    }


    public static void display(WebDriver driver){

       System.out.println(" title: " + driver.getTitle());
       System.out.println("url: "+ driver.getCurrentUrl());




    }



}
