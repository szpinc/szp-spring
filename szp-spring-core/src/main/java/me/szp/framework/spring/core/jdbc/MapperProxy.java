package me.szp.framework.spring.core.jdbc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

public class MapperProxy implements InvocationHandler {
    private SqlSession sqlSession;
    private String mybatisXmlName;

   public MapperProxy(SqlSession mySqlSession , String mybatisXmlName){
       this.sqlSession = mySqlSession;
       this.mybatisXmlName = mybatisXmlName;
   }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        XmlBuilderMapper xmlBuilderMapper = new XmlBuilderMapper();
        List<MapperInfo> mapperInfoList = xmlBuilderMapper.buildMapper(mybatisXmlName);
        if (mapperInfoList != null && mapperInfoList.size() != 0){
            for (MapperInfo mapperInfo :
                    mapperInfoList) {
                if (!method.getDeclaringClass().getName().equals(mapperInfo.getInterfaceName())){
                    return null;
                }
                if (method.getName().equals(mapperInfo.getMethodName())){
                    return sqlSession.selectOne(mapperInfo,args);
                }

            }
        }

        return null;
    }
}
