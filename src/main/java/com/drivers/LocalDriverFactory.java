package com.drivers;

import com.config.ConfigFactory;
import com.drivers.manager.ChromeManager;
import com.drivers.manager.FirefoxManager;
import com.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory {
    private LocalDriverFactory() {
    }

    public static WebDriver getDriver() {
        WebDriver driver = null;
        if (isBrowserChrome()) driver = ChromeManager.getDriver();
        else driver = FirefoxManager.getDriver();
        return driver;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }
}
