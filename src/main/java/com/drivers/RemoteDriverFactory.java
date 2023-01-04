package com.drivers;

import com.config.ConfigFactory;
import com.converters.StringToRemoteModeBrowserTypeConverter;
import com.enums.BrowserRemoteModeType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {
    private RemoteDriverFactory(){}

    public static WebDriver getDriver(){
        BrowserRemoteModeType browserRemoteModeType= ConfigFactory.getConfig().browserRemoteMode();
        if(browserRemoteModeType==BrowserRemoteModeType.SELENIUM){

        }
        else if(browserRemoteModeType==BrowserRemoteModeType.SELENOID){

        }
        else if(browserRemoteModeType==BrowserRemoteModeType.BROWSER_STUCK){

        }
        return null;
    }



}
