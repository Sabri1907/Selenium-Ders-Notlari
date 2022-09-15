package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class A_SinifCalismasi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1. http://a.testaddressbook.com adresine gidin
        driver.get("http://a.testaddressbook.com");

        //Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();

        // 2. email textbox, password textbox and sign in buton elementlerini locate ediniz
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement password=driver.findElement(By.id("session_password"));
        WebElement signin=driver.findElement(By.name("commit"));

        // 3. Kullanici adi ve sifreyi asagidaki gibi girin ve oturum ac (sign in) butonunu tiklayin
            // Username: testtechproed@gmail.com
            // Password: Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();

        // 4. Expected user id'nin testtechproed@gmail.com oldugunu dogrulayin
        WebElement expectedUser=driver.findElement(By.className("navbar-text"));
        if (expectedUser.isDisplayed()){
            System.out.println("ExpectesUser Testi PASSED " + expectedUser.getText());
        }else System.out.println("ExpectesUser Testi FAILED");
        // NOT: Bir webelementin ustundeki yaziyi konsolda yazdirmak icin getText() methodu kullanilir.

        //2.YONTEM:
        String istenenUserYazisi="testtechproed@gmail.com";
        String actualUserYazisi=expectedUser.getText();
        if (istenenUserYazisi.equals(actualUserYazisi)){
            System.out.println("ExpectedUser Testi PASSED");
        } else System.out.println("ExpectedUser Testi PASSED");

        // 5. Adresses ve Sign Out textlerinin goruntulendigini (displayed) dogrulayin (verify)
        WebElement addresses= driver.findElement(By.linkText("Addresses"));
        WebElement signOut= driver.findElement(By.linkText("Sign out"));
        if (addresses.isDisplayed()){
            System.out.println("Addresses Testi PASSED");
        }else System.out.println("Addresses Testi FAILED");

        if (signOut.isDisplayed()){
            System.out.println("SignOut Testi PASSED");
        }else System.out.println("signOut Testi FAILED");

        // 6. Sayfada kac tane link oldugunu bulun
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("Linklerin Sayisi: "+linklerListesi.size());

        // 7. Linkleri yazdiriniz
       // System.out.println(linklerListesi); => Hash Kodunu yazdirir
        for (WebElement each:linklerListesi) {
            System.out.println("Linkler: "+ each.getText());
        }

        // 8. Linkleri lambda ile yazdiriniz
        linklerListesi.forEach(t-> System.out.println(t.getText()));

        // 9. Sayfayi Kapatiniz
        driver.close();



    }
}
