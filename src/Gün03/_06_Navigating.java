package Gün03;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_Navigating extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        // Tarayıcının linklere tıklandığında gidip geldiği sayfaları
        // saklar ve aşağıdaki komutlarla ileri geri yönlendirilebilir.
        Bekle(3);
        WebElement elemet=driver.findElement(By.linkText("Alerts (JavaScript)"));
        elemet.click();
        Bekle(3);

        driver.navigate().back();
        Bekle(3);

        driver.navigate().forward();

        BekleKapat();

    }
}
