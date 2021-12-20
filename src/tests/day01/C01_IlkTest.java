package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com");


        System.out.println("su andaki URL "+driver.getCurrentUrl());// su andaki url'yi verir

        System.out.println("su anki baslik "+driver.getTitle());// basligi verir
        driver.manage().window().maximize();
        Thread.sleep(2000); // 2 saniye=2000 milisaniye-> sistemi uyuttu

        driver.navigate().to("https://www.youtube.com");   // navigate bir rota olusturuyor
        // navigate de sayfalar arasinda URL yazmadan sayfalar arasinda gidip gelmeyi saglar
        Thread.sleep(2000);

        driver.navigate().back(); //geri gider
        Thread.sleep(2000);

        driver.navigate().forward();// ileri gider
        Thread.sleep(2000);

        driver.navigate().refresh(); // browser'i sayfayi yeniler
        Thread.sleep(2000);

        // quit ve close ayni islemi yapar ama arada bir fark var
        // driver.quit(); // acik olan tum browserlari kapatir
        driver.close();// sadece 1 browser kapatir. Test boyunca 1'den fazla browser acildiysa quit() kullanilmali

    }
}
