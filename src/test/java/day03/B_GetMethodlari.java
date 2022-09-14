package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class B_GetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");

        // Arama kutusunu locate ediniz
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        // Arama kutusunun tagName'inin input oldugunu test ediniz
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName Testi PASSED : "+actualTagName);
        }else System.out.println("TagName Testi FAILED : "+actualTagName);

        // Arama kutusunun name attribute degerinin "field-keywords" oldugunu test ediniz
        String expectedAttribute="field-keywords";
        String actualdAttribute=aramaKutusu.getAttribute("name");
        if (expectedAttribute.equals(actualdAttribute)){
            System.out.println("Attribute Testi PASSED : "+aramaKutusu.getAttribute("name"));
        }else System.out.println("Attribute Testi FAILED : "+aramaKutusu.getAttribute("name"));

        // Arama Kutusunun konumunu yazdiriniz
        System.out.println("Arama Kutusu Konumu: "+aramaKutusu.getLocation()); // (279, 11)=> pixel olarak verir

        // Sayfayi kapatiniz
        driver.close();
    }
}
