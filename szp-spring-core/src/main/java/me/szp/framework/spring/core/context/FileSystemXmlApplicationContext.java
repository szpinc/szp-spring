package me.szp.framework.spring.core.context;

import lombok.extern.slf4j.Slf4j;
import me.szp.framework.spring.core.beans.GenericBeanDefinition;

import java.util.Map;

/**
 *  @Author xiao liang
 */
@Slf4j
public class FileSystemXmlApplicationContext extends XmlApplicationContext {


    public  Map<String, GenericBeanDefinition> getGenericBeanDefinition(String contextConfigLocation){

        Map<String, GenericBeanDefinition>  genericBeanDefinition  = super.getBeanDefinitionMap(contextConfigLocation);

        return genericBeanDefinition;
    }
}


