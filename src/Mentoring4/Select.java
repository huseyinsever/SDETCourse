package Mentoring4;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class Select extends BaseStaticDriver {


    @Test
    public void selectTest() throws InterruptedException {

        driver.get("https://sqengineer.com/practice-sites/basic-web-elements/");

        Select selectBox = new Select(driver.findElement(By.id("selectBox")));
        selectBox.selectByIndex(0);
        System.out.println("get first when New York : "+selectBox.getFirstSelectedOption().getText());
        selectBox.getOptions().forEach(opt -> System.out.println(opt.getClass()));

        System.out.println("-----------------------------------------------------");
        Bekle(3);

        selectBox.selectByValue("Francisco");
        System.out.println("get first when San francisco : "+selectBox.getFirstSelectedOption().getText());

        System.out.println("-----------------------------------------------------");
        Bekle(3);

        selectBox.selectByVisibleText("Sydney");
        System.out.println("get first when Sydney : "+selectBox.getFirstSelectedOption().getText());

        System.out.println("-----------------------------------------------------");

        selectBox.getAllSelectedOptions().forEach(opt -> System.out.println(opt.getClass()));

        System.out.println("a----------------------------------------------------");

        System.out.println("selectBox.getWrappedElement().getText() = " + selectBox.getWrappedElement().getClass());

        Assert.assertEquals(selectBox.getFirstSelectedOption().getText(), "Sydney");

        driver.quit();
    }

    private Object getWrappedElement() {
        return null;
    }

    private Iterable<Object> getAllSelectedOptions() {
        return null;
    }

    private void selectByVisibleText(String sydney) {
    }

    public void selectByValue(String francisco) {
    }

    private Iterable<Object> getOptions() {
        return null;
    }

    private AbstractButton getFirstSelectedOption() {
        return null;
    }

    private void selectByIndex(int i) {
    }
    public Select(Object selectBox) {

    }
}
