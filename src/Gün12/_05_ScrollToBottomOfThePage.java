package Gün12;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;

public class _05_ScrollToBottomOfThePage extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        // Sayfanın sonuna kadar kaydırır



        BekleKapat();

    }
}
