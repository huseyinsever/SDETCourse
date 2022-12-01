package Mentoring3;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionTraining extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://automationpractice.com/index.php");
        Actions action = new Actions(driver);

        WebElement element = driver.findElement(By.cssSelector("#homefeatured > li:nth-child(2)"));
        action.moveToElement(element).perform();

        Bekle(3);

        WebElement addToCart = driver.findElement(By.xpath("(//span[.='Add to cart']/parent::a)[2]"));
        action.moveToElement(addToCart).click().perform();

        Bekle(3);

        WebElement checkOutButton = driver.findElement(By.partialLinkText("Proceed to checkout"));
        action.moveToElement(checkOutButton).click().perform();

        WebElement searchInput = driver.findElement(By.id("search_query_top"));
        action.moveToElement(searchInput)
                                 .click()
                                 .keyDown(Keys.SHIFT).
                                 sendKeys("c").
                                 keyUp(Keys.SHIFT).
                                 sendKeys("omputer").
                                 perform();

        WebElement submitButton = driver.findElement(By.name("submit_search"));
        submitButton.click();

        Bekle(2);
        WebElement image = driver.findElement(By.xpath("(//*[@class='replace-2x img-responsive'])[7]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",image);
        Bekle(2);
        js.executeScript("arguments[0].click()",image);

        BekleKapat();









    }
}
