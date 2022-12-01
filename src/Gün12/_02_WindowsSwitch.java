package Gün12;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _02_WindowsSwitch extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.selenium.dev/");
        String anaSayfaWindowId= driver.getWindowHandle(); // -> Bulunduğu sayfanın win id sini verir

        List <WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link:linkler) {
            if (!link.getAttribute("href").contains("mailto"))
                link.click();
        }
        Set<String>windowsIdler=driver.getWindowHandles(); // -> Acık olan tüm sayfaların win id leri

        for (String ıd:windowsIdler) {
            if (ıd.equals(anaSayfaWindowId)) continue;// -> Ana sayfa değilse

            driver.switchTo().window(ıd);// -> Diğer sayfaya (Window a) geçiş yaptık
            System.out.println(ıd + " Title = " + driver.getTitle());
        }

            Bekle(4);
            BekleKapat();

    }
}
