package Gün12;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _06_ScrollToWebElement extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js= (JavascriptExecutor) driver;

        WebElement element=driver.findElement(By.linkText("Take a quiz"));
        js.executeScript("arguments[0].scrollIntoView()", element); // elemente kadar scroll yapar

        Bekle(2);

        js.executeScript("arguments[0].click()", element); // elemente click yapar

        BekleKapat();

    }
}
