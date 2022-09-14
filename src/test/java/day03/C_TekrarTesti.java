package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class C_TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina ""https://www.amazon.com" gidin
        driver.get("https://www.amazon.com");

        // Arama kutusunda "city bike" aratin
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

        // Amazon'da goruntulenen ilgili sonuclarin sayisini yazdirin
        List<WebElement> aramaSonucu= driver.findElements(By.className("sg-col-inner"));
        String sonucYazisi=aramaSonucu.get(0).getText();
        System.out.println(sonucYazisi);

        // Sadece sonuc sayisini yazdiriniz
        String[] sonuzYazisiElementi=sonucYazisi.split(" ");
        System.out.println("City Bike Arama Sonucu: "+sonuzYazisiElementi[2]);

        // Sadece sonuc sayisini LAMBDA ile yazdiriniz
        Arrays.stream(sonucYazisi.split(" ")).limit(3).skip(2).forEach(t-> System.out.println(t));

        // Sonra karsiniza cikan ilk sonucun resmine tiklayin
        List<WebElement> ilkResim=driver.findElements(By.className("s-image"));
        WebElement ilkResimE=ilkResim.get(0);
        ilkResimE.click();

        // Sayfayi kapatin
        driver.close();



    }
}
