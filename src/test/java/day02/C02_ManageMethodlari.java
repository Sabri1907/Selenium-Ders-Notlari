package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        // Amazon sayfasina gidelim "https://amazon.com"
         driver.get("https://amazon.com");

         // Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere konumu: "+driver.manage().window().getPosition()); //=>Acilan pencerenin konumunu verir
        System.out.println("Pencere olculeri: "+driver.manage().window().getSize()); //=>Acilan sayfanin olculerini verir

        // Sayfayi simge durtumuna getirin
        driver.manage().window().minimize(); //=> Pencereyi simge durumuna getirin.

        // Simge durumunda 3 saniye bekleyip sayfayi maximize yapin.
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // Sayfanin konumunu ve boyutlarini maximixe durumunda yazdirin
        System.out.println("Maximize Durumunda Pencere konumu: "+driver.manage().window().getPosition());
        System.out.println("Maximize Durumunda Pencere olculeri: "+driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin.
        System.out.println("Fullscreen Durumunda Pencere konumu: "+driver.manage().window().getPosition());
        System.out.println("Fullscreen Durumunda Pencere olculeri: "+driver.manage().window().getSize());

        // Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();



    }
}
