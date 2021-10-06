package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Cssselector {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun : Locators_css
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammed Furkan Yılm\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        // b. Locate email textbox
        WebElement emailTextBox= driver.findElement(By.cssSelector(".form-control")); // ctrl+f-> 2 tane bulmustu
        emailTextBox.sendKeys("testtechproed@gmail.com");

       //************ xpath ve css de unique olmasa bile ilk gordugune yapar***********


        // c. Locate password textbox ve
        // css selector ile uzun yazim
       // WebElement passwordTextBox= driver.findElement(By.cssSelector("input[id='session_password']"));

        // css selector ile uzun yazim
        WebElement passwordTextBox= driver.findElement(By.cssSelector("#session_password"));

        //xpath ile yazim
        //WebElement passwordTextBox= driver.findElement(By.cssSelector("(//input[@class='form-control'])[2]"));

        passwordTextBox.sendKeys("Test1234!");


        // d. Locate signin button
        WebElement submitButonu= driver.findElement(By.cssSelector("input[type='submit']"));

        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        submitButonu.click();

        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!

        //ODEV
        // amazon.com a gidip java kelimesini aratin
        // kac sonuc geldigini ve gelen sonuclardan 4.ve 7.nin isimlerini yazdirin
    }
}
