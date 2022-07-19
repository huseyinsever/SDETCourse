package Gün04;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ödev2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com");

        WebElement element=driver.findElement(By.cssSelector("[class='col-xs-14 search-box-wrapper'] [placeholder='Search products & brands']"));
        element.sendKeys("teddy bear");
        Bekle(2);
        WebElement element2=driver.findElement(By.cssSelector("[class='searchformButton col-xs-4 rippleGrey'] [class='searchTextSpan']"));
        element2.click();
        Bekle(2);
        WebElement msg=driver.findElement(By.cssSelector("[id='searchMessageContainer'] [style='color: #212121; font-weight: normal']"));
        if (msg.getText().contains("We've got 296 results for 'teddy bear'"))
        System.out.println("Dogrulandi");

        else
            System.out.println("Hata");

        BekleKapat();








    }
}
