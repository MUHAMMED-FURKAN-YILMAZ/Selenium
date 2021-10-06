package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammed Furkan Yılm\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        // a.google web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // b. Search(ara) “city bike”
        WebElement searchButon= driver.findElement(By.id("twotabsearchtextbox"));
        searchButon.sendKeys("city bike"+ Keys.ENTER);

        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonuc= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonuc.getText());

        // d. “Shopping” e tıklayın. //Today's Deals
        //WebElement link= driver.findElement(By.linkText("Today's Deals"));
        //link.click();

        // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        Thread.sleep(2000);
        WebElement resimClick= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img"));
        resimClick.click();

    }
}
