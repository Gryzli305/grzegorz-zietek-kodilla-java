package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;

public class GoogleTestingApp {
    public static final String SEARCHFIELD = "gsr";

    public static void main(String[] args) {


        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com");

        WebElement searchField = driver.findElement(By.id(SEARCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }
}