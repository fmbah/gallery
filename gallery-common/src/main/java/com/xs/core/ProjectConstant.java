package com.xs.core;

/**
 * @Auther: Fmbah
 * @Date: 18-10-10 下午4:26
 * @Description: 项目常量
 */
public final class ProjectConstant {
    public static final String BASE_PACKAGE = "com.xs";//基础扫描包

    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".beans";//生成的Model所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".daos";//生成的Mapper所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".services";//生成的Service所在包
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";//生成的ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".controllers";//生成的Controller所在包

    public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.smapper.SMapper";//Mapper插件基础接口的完全限定名
}
