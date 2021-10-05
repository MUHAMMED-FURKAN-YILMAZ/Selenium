package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun: LocatorsIntro
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammed Furkan Yılm\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        // b. Sign in butonuna basin
        WebElement signILinki= driver.findElement(By.linkText("Sign in"));
        signILinki.click();

        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        Thread.sleep(2000);
        WebElement emailTextBox= driver.findElement(By.id("session_email"));
        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        WebElement signInButonu= driver.findElement(By.name("commit"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement dogruKullanici=driver.findElement(By.className("navbar-text"));
        String username="testtechproed@gmail.com";

        if (dogruKullanici.getText().equals(username)) {
            System.out.println("dogru kullanici testi PASS");
        } else {
            System.out.println("dogru kullanici testi FAILED");
        }

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesLinki= driver.findElement(By.linkText("Addresses"));
        WebElement signOutLinki= driver.findElement(By.linkText("Sign out"));

       if (adressesLinki.isDisplayed()){
           System.out.println("adresses linki gorunuyor, test PASS");
       } else {
           System.out.println("adresses linki gorunmuyor, test FAILED");
       }

        if (signOutLinki.isDisplayed()){
            System.out.println("sign out linki gorunuyor, test PASS");
        } else {
            System.out.println("sign out linki gorunmuyor, test FAILED");
        }

        //3. Sayfada kac tane link oldugunu bulun.

        //******yarina odev********
        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a.google web sayfasına gidin. https://www. amazon.com/
        // b. Search(ara) “city bike”
        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        // d. “Shopping” e tıklayın.
        // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

    }
}