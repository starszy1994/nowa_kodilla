package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.kodilla.com/sign-in");

        WebElement inputField = driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input"));
        inputField.sendKeys("testuser@gmail.com");

        WebElement inputField2 = driver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
        inputField2.sendKeys("Haslo");
    }
}