package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_Sira4ve7yiYazdirma {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammed Furkan Yılm\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // amazon.com a gidip java kelimesini aratin
        driver.get("https://www.amazon.com");

        WebElement searcBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searcBox.sendKeys("java"+ Keys.ENTER);

        // kac sonuc geldigini
        WebElement returnResult= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(returnResult.getText());

        // gelen sonuclardan 4.ve 7.nin isimlerini yazdirin
        WebElement result4 =driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[4]"));
        WebElement result7 =driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[7]"));

        System.out.println("4. Result: "+result4.getText());
        System.out.println("7. Result: "+result7.getText());

       driver.close();

    }
}
