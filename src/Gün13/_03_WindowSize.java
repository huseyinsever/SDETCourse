package Gün13;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _03_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();// Ekranı Tam hale getiriyor
        Bekle(4);

        // Ekranı yeni ölçülere göre set etme
        Dimension dimension=new Dimension(515,600);
        driver.manage().window().setSize(dimension);

        Bekle(4);
        BekleKapat();




    }
}
