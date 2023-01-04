package com.converters;

import com.enums.BrowserType;
import com.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToRunModeBrowserTypeConvertor implements Converter<RunModeBrowserType> {
    @Override
    public RunModeBrowserType convert(Method method, String runMode) {
       return RunModeBrowserType.valueOf(runMode.toUpperCase());
    }
}
