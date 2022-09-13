package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // Amazon sayfasina gidelim
        driver.get("https://amazon.com");

        // Sayfa basligini yazdirin
        System.out.println("Sayfa Basligi " + driver.getTitle());

        // Sayfa basliginin "Amazon" icerdigini test edin
        String actualTitle=driver.getTitle();
        String istenenKelime="Amazon";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title Testi PASSED");
        }else System.out.println("Title Testi FAILED");

        // Sayfa adresini (URL) yazdirin
        System.out.println("Sayfanin URL'i: "+driver.getCurrentUrl());

        // Sayfa URL'inin "amazon" icerdigini test edin
        String actualUrl=driver.getCurrentUrl();
        String arananKelime="amazon";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url Testi PASSED");
        }else System.out.println("Url Testi FAILED");

        // Sayfa handle degerini yazdirin
        System.out.println("Sayfanin Handle Degeri: "+driver.getWindowHandle());

        // Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String actualPageSource=driver.getPageSource();
        String htmlArananKelime="Gateway";
        if (actualPageSource.contains(htmlArananKelime)){
            System.out.println("Source Code Testi PASSED");
        }else System.out.println("Source Code Testi FAILED");

        // Sayfayi kapatin
        driver.close();

    }
}
