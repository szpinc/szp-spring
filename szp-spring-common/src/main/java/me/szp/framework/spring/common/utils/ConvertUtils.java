package me.szp.framework.spring.common.utils;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/10 9:55
 */
public class ConvertUtils {

    /**
     * 基本类型转换
     *
     * @param className
     * @param parameter
     * @return
     */
    public static Object convert(String className, String parameter) {

        if (String.class.getSimpleName().equals(className)) {
            return parameter;
        } else if (Integer.class.getSimpleName().equals(className)) {
            return Integer.valueOf(parameter);
        } else if (int.class.getSimpleName().equals(className)) {
            return Integer.valueOf(parameter);
        } else if (Float.class.getSimpleName().equals(className)) {
            return Float.valueOf(parameter);
        } else if (Double.class.getSimpleName().equals(className)) {
            return Integer.valueOf(parameter);
        } else if (Long.class.getSimpleName().equals(className)) {
            return Long.valueOf(parameter);
        } else if (Short.class.getSimpleName().equals(className)) {
            return Short.valueOf(parameter);
        } else if (Byte.class.getSimpleName().equals(className)) {
            return Byte.valueOf(parameter);
        } else if (Boolean.class.getSimpleName().equals(className)) {
            return Boolean.valueOf(parameter);
        }

        return null;

    }

    /**
     * 是否是基础类型
     *
     * @param typeName
     * @return
     */
    public static boolean isBasicType(String typeName) {
        switch (typeName) {
            case "String":
            case "Integer":
            case "int":
            case "Long":
            case "Short":
            case "Float":
            case "Double":
            case "Byte":
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(int.class.getSimpleName());
    }

}
