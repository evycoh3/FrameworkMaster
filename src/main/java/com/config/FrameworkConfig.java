package com.config;

import com.converters.StringToBrowserTypeConvertor;
import com.enums.BrowserType;
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
    @ConverterClass(StringToBrowserTypeConvertor.class)
    BrowserType browser();


}
