package Gün03;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_FindingByLinkText extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");

        WebElement eleman=driver.findElement(By.linkText("Siparişlerim"));//-> sadece a tag larında çalısır.
        System.out.println("eleman.getText() = " + eleman.getText());
        System.out.println("eleman.getAttribute(title) = " + eleman.getAttribute("title"));
        System.out.println("eleman.getAttribute(href) = " + eleman.getAttribute("href"));
        System.out.println("eleman.getAttribute(rel) = " + eleman.getAttribute("rel"));

        WebElement eleman2=driver.findElement(By.partialLinkText("Süper Fiyat"));//-> sadece a tag larında çalısır.
        System.out.println("eleman2.getText() = " + eleman2.getText());
        


    }
}
