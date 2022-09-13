package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlariWait {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        driver.close();
        /*
        => Ileride "wait" konusunu daha genis olarak ele alinacak.
        => Bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore bir yukleme suresine
        ihtiyac vardir. Veya bir webelement'in kullanilabilmesi icin zamana ihtiyac olabilir.
        => ImplicitlyWait() bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        maximum sureyi belirleme olanagi tanir.

        ===============================THREAD.SLEEP()'DEN FARKI=================================================
        => Thread.sleep kullandigimizda belirttigimiz sure kadar mutlaka bekler.
        Ancak implicitlyWait()'de belirttigimiz sure kadar beklemez, sayfa belirtilen sure altinda
        ne zaman acilirsa  diger komutlardan calismaya devam eder. Ancak belirttigimiz sure icerisinde acilmazsa
        otomasyon calismayi durdurur ve testimiz FAIL olur.
         */
    }
}
