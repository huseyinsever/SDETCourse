package Gün03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByIdNotFoundException {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        try {
            WebElement eleman = driver.findElement(By.id("label_"));
            System.out.println(eleman.getText());
        }
        catch (Exception ex) {
            System.out.println("Eleman Bulunamadi = "+ex.getMessage() );
        }

        Thread.sleep(3000);
        driver.quit();






    }
}
