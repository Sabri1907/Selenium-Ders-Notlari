package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "http://a.testaddressbook.com/sign_in adresine gidin
        driver.get("http://a.testaddressbook.com/sign_in");

        /* ===================================> NOT <================================================
        => cssSelector'de sadece id icin # isareti kullanilir
        => cssSelector'de sadece class attribute'u icin icin . isareti kullanilir
         */

        // email textbox'ini test edin
        WebElement email= driver.findElement(By.cssSelector("#session_email"));

        // password texybox'ini locate edin
        WebElement password=driver.findElement(By.cssSelector("#session_password"));

        // signin butonunu locate edin
        WebElement signIn=driver.findElement(By.cssSelector("input[name='commit']"));

        // Kullanici adi ve sifre kismina asagidaki bilgileri girin ve signin butonuna tiklayin
                // Username: testtechproed@gmail.com
                // Password: Test1234!
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        Thread.sleep(3000);

        signIn.click();
        Thread.sleep(3000);

        // Sayfayi kapatin
        driver.close();

    }
}
