package Proje4;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Proje4_Senaryo1 extends BaseStaticDriver {
    public static void main(String[] args) {

        Tools.Login("kayhan555@outlook.com","kayhan3535");

        WebElement LogOut=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out")));
        Assert.assertTrue(LogOut.isDisplayed());

        BekleKapat();





    }
}
