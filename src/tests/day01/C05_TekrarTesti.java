package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_TekrarTesti {
    public static void main(String[] args) {
        //1. Yeni bir class olusturun (TekrarTesti)
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Muhammed Furkan Yılm\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        driver.get("https://www.youtube.com");
        String actualTitle= driver.getTitle();
        String expectedTitle="youtube";

        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test PASS");
        }else{
            System.out.println("Test FAILED");
            System.out.println("Actual Title: "+actualTitle);
        }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualUrl= driver.getCurrentUrl();
        String includeUrl="youtube";

        if (actualUrl.contains(includeUrl) ) {
            System.out.println("Actual URL contain "+includeUrl );
        } else {
            System.out.println("Actual URL does not contain "+includeUrl);
            System.out.println("Actual URL: "+actualUrl);
        }

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //5. Youtube sayfasina geri donun
        driver.navigate().back();

        //6. RefrSayfayi yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        String actualT= driver.getTitle();
        String includeT="Amazon";

        if (actualT.contains(includeT)) {
            System.out.println("Title contains: "+includeT);
        }else {
            System.out.println("Title does not contain: "+includeT);
            System.out.println("Actual title: "+actualT);
        }

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String actualU= driver.getCurrentUrl();
        String expectedU= "https://www.amazon.com/";

        if (actualU.equals(expectedU)) {
            System.out.println("Test PASS");
        }else{
            System.out.println("Test FAILED");
            System.out.println("Actual URL: "+actualUrl);
        }

        //11.Sayfayi kapatin
        driver.close();
    }
}
