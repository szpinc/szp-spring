package me.szp.framework.spring.core.jdbc;

import java.lang.reflect.Proxy;

public class SqlSession {


    public <T> T selectOne(MapperInfo mapperInfo ,Object[] paremeters){
        MyExecutor myexecutor = new MyExecutor();
        return myexecutor.query(mapperInfo,paremeters);
    }

    public <T> T getMapper(Class<?> aClass,String mybatisXmlName){

        return (T) Proxy.newProxyInstance(aClass.getClassLoader(),new Class[]{aClass},new MapperProxy(this,mybatisXmlName));


    }


}
