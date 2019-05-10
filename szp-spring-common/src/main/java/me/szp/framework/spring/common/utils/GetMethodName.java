package me.szp.framework.spring.common.utils;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/10 10:01
 */
public class GetMethodName {
    /**
     * 根据字段获取set方法
     *
     * @param propertyName
     * @return
     */
    public static String getSetMethodNameByField(String propertyName) {
        return "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
    }
}
