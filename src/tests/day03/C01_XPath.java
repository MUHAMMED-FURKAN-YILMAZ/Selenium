package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin
        //WebElement button= driver.findElement(By.tagName("button"));
        //WebElement button= driver.findElement(By.xpath("//button"]"));
        //WebElement button= driver.findElement(By.xpath("//*[text()='Add Element']"));
        //WebElement button= driver.findElement(By.xpath("//button[@onclick='addElement']"));
        WebElement button= driver.findElement(By.xpath("//button[text()='Add Element']"));
  // normal id ile xpath'le de yapardik ama xpath'de text'i denemek icin bu yolla yaptik. bir cok yolla yapilabilir
        button.click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        Thread.sleep(2000);
        WebElement del= driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        if (del.isDisplayed()){
            System.out.println("delete tusu Gorunuyor");
        }else {
            System.out.println("delete tusu gorunmuyor");
        }

        //4- Delete tusuna basin
        del.click();

        //5- Delete butonunun gorunur olmadigini test edin

        //eger butona bastigimizda HTML kodundaki satir da siliniyorsa
        //diriver'in o elemente ulasmasi mumkun olmayacagindan varligini yada
        //yoklugunu test etmemiz mumkun olmaz varolan bir element bu sekilde
        //silindikten sonra locate etmeye calisilirsa StaleElementReferenceException hatasi aliriz

      /*
        if (del.isDisplayed()){
            System.out.println("delete tusu Gorunuyor");
        }else {
            System.out.println("delete tusu gorunmuyor");
        }
         */
        // o sebeple burada StaleElementReferenceException exception'i verir

        driver.close();
    }
}
