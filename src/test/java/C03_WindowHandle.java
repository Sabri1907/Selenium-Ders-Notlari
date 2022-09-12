import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        System.out.println(driver.getWindowHandle()); //CDwindow-CB409125474CD27025C7D4D40AF13730
        // Farklı pencereler arasında gezinebilmek için getWindowHandle() methodunu kullanırız
    }
    
}
