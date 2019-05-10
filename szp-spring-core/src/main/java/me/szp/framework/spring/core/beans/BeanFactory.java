package me.szp.framework.spring.core.beans;

/**
 * BeanFactory接口
 *
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/10 9:34
 */
public interface BeanFactory {

    /**
     * 根据bean名称获取对象实例
     *
     * @param
     * @return
     */
    Object getBean(String beanId);

}
