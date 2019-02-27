package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;

public class EBayTestingApp {

    public final static String SEARCHFIELD = "_nkw";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com/");

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
