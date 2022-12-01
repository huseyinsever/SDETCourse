package Gün06;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _09_DragAndDropBy extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement solSurgu=driver.findElement(By.xpath("//*[@class='ui-slider-range ui-widget-header ui-corner-all']//following::span"));

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.dragAndDropBy(solSurgu,100,0).build();
        aksiyon.perform();


        Bekle(2);
        BekleKapat();


    }
}
