package com.config;


import com.converters.StringToRunModeBrowserTypeConvertor;
import com.enums.BrowserRemoteModeType;
import com.enums.BrowserType;
import com.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        /*from maven*/
        "system:properties",
        /*from jenkins */
        "system:env",
        /* from my local config */
        "file:${user.dir}/src/main/resources/config.properties"
        /*Else will Take default values */
})
public interface FrameworkConfig extends Config {
    @DefaultValue("CHROME")
    @ConverterClass(StringToRunModeBrowserTypeConvertor.class)
    BrowserType browser();

    @Key("runModeBrowser")
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();


}
