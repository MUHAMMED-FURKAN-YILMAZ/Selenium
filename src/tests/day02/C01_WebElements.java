package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

//<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="E-posta veya Telefon Numarası" autofocus="1" aria-label="E-posta veya Telefon Numarası">
        //email textbox'a Ali yazdiralim
        WebElement mailTextBox= driver.findElement(By.id("email"));
        mailTextBox.sendKeys("aliseleniumcu@gmail.com");

        Thread.sleep(2000);
        mailTextBox.clear();

        WebElement mailKutusuTagNameIle= driver.findElement(By.tagName("input"));
       // mailKutusuTagNameIle.sendKeys("veliGocer@gmail.com");// -> input tag name'i ile 6 tane webelement oldugundan hangisine yazacagina karar veremiyor
                                                                 // webelementi buldugu icin NoSuchElementException vermez

       // WebElement yanlisElement= driver.findElement(By.id("emailyanlis")); //***NoSuchElementException-> bu hatayi goruyorsak Locater'da hata var demektir***
       // yanlisElement.sendKeys("yanlis eleman");


        // giris yap butonuna tiklayalim
        WebElement girisButonu= driver.findElement(By.tagName("button"));

        System.out.println(girisButonu.isEnabled()); //-> erisilebiliyor mu T/F dondurur
        girisButonu.click();





    }
}
