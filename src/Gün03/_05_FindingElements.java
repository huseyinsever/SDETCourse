package Gün03;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_FindingElements extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> liste=driver.findElements(By.tagName("a"));
        for (WebElement a: liste)
            System.out.println("a.getText() = " + a.getText());





        BekleKapat();

    }
}
