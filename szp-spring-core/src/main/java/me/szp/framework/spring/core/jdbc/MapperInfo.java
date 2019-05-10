package me.szp.framework.spring.core.jdbc;

import lombok.Data;


@Data
public class MapperInfo {

    private String interfaceName;
    private String sqlContent;
    private String methodName;
    private String resultClassName;
}
