package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammed Furkan Yılm\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        // amazon web sayfasina gidip java icin arama yapin ve bulunan sonuc sayisini yazdirin
        driver.get("https://www.amazon.com");

      // <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java"+ Keys.ENTER);


        //bulunan sonuc yazisini sonucYazisina assign ettik
        WebElement sonucYazisi= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucYazisi.getText());

        //WebElementler obje oldugu icin direkt yazdirilamazlar. yazilirsa referanslari karsimiza cikar
        //WebElementin sahip oldugu yaziyi string olarak yazdirmak icin .getText methodu kullanilir


    }
}
