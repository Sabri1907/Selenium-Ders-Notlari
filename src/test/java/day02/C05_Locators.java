package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Amazon sitesine gidin
        driver.get("https://amazon.com");

        // Amazon;da nutella aratin
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        // Tekrar kullanacagimiz kodlari Webelement olusturup atayabiliriz.
        // Yanlis id locate edilirse NoSuchElementException aliriz

        //driver.findElement(By.name("field-keywords")).sendKeys("Nutella"+Keys.ENTER);
        // Name unique oldugu icin name ile de locate edebildik.

        /*
        NOT: Locator alirken gozumuzden kacan detaylar olabilir. Aldigimiz bir locator calismazsa alternatif
        locator'lar denemeliyiz.
         */

       aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // sendKeys() ile arama kutusuna yazacagimiz string degeri yazariz.
        //(Virgul veya + kullanarak Keys.ENTER yazarak arama kutusuna yazdigimiz degeri aratabiliriz.

        driver.findElement(By.linkText("Sell products on Amazon")).click();
        // Html'de <a> tag'iyla baglanti saglanan link'ler linktext kullanilarak locate edilebilir.

        driver.findElement(By.partialLinkText("oducts on Amazon")).click();
        // partialLinkText() ile linkText'in bir kismini kullanarak locate edebiliriz.

    }
}
