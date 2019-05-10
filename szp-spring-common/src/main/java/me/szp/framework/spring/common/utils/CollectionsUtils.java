package me.szp.framework.spring.common.utils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/10 10:12
 */
public class CollectionsUtils {

    /**
     * 向集合中插入一个元素，保证不会重复
     *
     * @param list
     * @param t
     * @param <T>
     */
    public static <T> void addUnique(List<T> list, T t) {
        Set<T> set1 = new HashSet<>(list);
        if (set1.add(t)) {
            list.add(t);
        }
    }

}
