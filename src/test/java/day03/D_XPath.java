package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D_XPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(3000);

        // Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        /* ================================> NOT <==============================================
        => Locate alirken sadece text kullanacaksak //*[text()='Add Element'] seklinde kullanilir.
        => Attribute kullanarak locate edeceksek //*[@class='added-manually'] seklinde kullanilir.
         */

        // Delete butonu'nun gorunur oldugunu test edin
       WebElement deleteButton= driver.findElement(By.xpath("//*[@class='added-manually']"));
       if (deleteButton.isDisplayed()){
           System.out.println("Delete Button Testi PASSED");
       } else System.out.println("Delete Button Testi FAILED");
       Thread.sleep(3000);

        // Delete tusuna basin
        deleteButton.click();


        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement= driver.findElement(By.xpath("//h3"));
        if (addRemoveElement.isDisplayed()){
            System.out.println("Add/Remove Yazisi Testi PASSED");
        } else System.out.println("Add/Remove Yazisi Testi FAILED");
        Thread.sleep(3000);

        // Sayfayi kapatin
        driver.close();
    }
}
