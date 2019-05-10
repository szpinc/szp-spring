package me.szp.framework.spring.common.utils;


public class StringUtils {
    public static boolean isEmpty(String string) {
        if ((string == null) || "".equals(string)) {
            return true;
        }
        return false;
    }
}

