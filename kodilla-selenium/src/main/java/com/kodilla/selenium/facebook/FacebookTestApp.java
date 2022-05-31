package com.kodilla.selenium.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/selenium-drivers/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[3]/div[2]/div/div/div/div/div[3]/button[1]")));
        WebElement inputField = driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div/div/div[3]/button[1]"));
        inputField.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")));
        WebElement inputField2 = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
        inputField2.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));

        WebElement yearCombo = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]/div/span/span/select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);
    }
}