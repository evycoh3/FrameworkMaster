package com.converters;

import com.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRemoteModeBrowserTypeConverter {
    public class BrowserRemoteModeType implements Converter<RunModeBrowserType> {
        @Override
        public RunModeBrowserType convert(Method method, String remoteMode) {
            return RunModeBrowserType.valueOf(remoteMode.toUpperCase());
        }
    }
}
