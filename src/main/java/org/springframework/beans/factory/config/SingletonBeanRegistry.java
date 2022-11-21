package org.springframework.beans.factory.config;

/**
 * 单例注册表
 *
 * @author Ling, Jiatong
 * Date: 2022/11/21 14:11
 */
public interface SingletonBeanRegistry {

    /**
     * 从注册表中获取单例对象
     *
     * @param beanName bean的名称
     * @return 单例对象
     */
    Object getSingleton(String beanName);

}
