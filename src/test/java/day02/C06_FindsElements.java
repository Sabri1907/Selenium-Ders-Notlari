package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C06_FindsElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Amazon sayfasina gidiniz
        driver.get("https://amazon.com");

        // Amazon sayfasindaki tag'lari input olanlarin sayisini yazdiriniz
        List<WebElement> tag= driver.findElements(By.tagName("input"));
        // WebElement'leri Liste atip sayisini bulabiliriz.
        // Webelementleri list'e atarken index numarasi 0'daslar.

        System.out.println("Input Tag Sayisi:" + tag.size());

        System.out.println(driver.findElement(By.xpath("(//*[@class='a-color-base headline truncate-2line'])[1]")).getText());
        // getText() ile locate ettigimiz webelement'lerin yazilarini getirir.

    }
}
