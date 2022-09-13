package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        // Amazon sayfasina gidelim "https://amazon.com"
        driver.get("https://amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutlari: "+driver.manage().window().getSize());

        // Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin.
        driver.manage().window().setPosition(new Point(50,60)); // => Sayfanin konumunu istedigimiz sekilde ayarladik
        driver.manage().window().setSize(new Dimension(600,300)); //=>Sayfanin boyutlarini istedigimiz sekilde ayarladik

        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin.
        System.out.println("Sayfanin Yeni Konumu: "+driver.manage().window().getPosition());
        System.out.println("Sayfanin Yeni Boyutlari: "+driver.manage().window().getSize());

        // Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
