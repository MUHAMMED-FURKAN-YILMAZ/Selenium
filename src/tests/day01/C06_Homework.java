package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Homework {
    public static void main(String[] args) {

        //1.Yeni bir class olusturalim (Homework)
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammed Furkan Yılm\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.navigate().to("https://www.facebook.com");

        String actualTitle= driver.getTitle();
        String expectedTitle="facebook";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test PASS");
        }else{
            System.out.println("Test FAILED");
            System.out.println("ACtural title: "+actualTitle);
        }

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl= driver.getCurrentUrl();
        String includeUrl="facebook";

        if (actualUrl.contains(includeUrl)) {
            System.out.println("Actual URL contain "+includeUrl);
        }else {
            System.out.println("URL does not contain "+includeUrl);
        }

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
         actualTitle= driver.getTitle();
         String includeTitle="Walmart.com";

        if (actualTitle.contains(includeTitle)) {
            System.out.println("Actual URL contains "+includeTitle);
        } else {
            System.out.println("Actual URL does not contain "+includeTitle);
        }

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //9.Browser’i kapatin
        driver.close();
    }
}
