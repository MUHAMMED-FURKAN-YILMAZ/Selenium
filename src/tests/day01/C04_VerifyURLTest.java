package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyURLTest {
    public static void main(String[] args) {
        //Yeni bir class olusturalim : (VerifyURLTest)
        // Youtube ana sayfasina gidelim https://www.techproeducation.com/
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Sayfa URL’inin www.techproeducation.com oldugunu dogrulayin
        driver.get("https://www.techproeducation.com");

        String expectedUrl="https://www.techproeducation.com";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
            System.out.println("Gecerli URL "+ actualUrl);
        }
        driver.close();

    }
}
