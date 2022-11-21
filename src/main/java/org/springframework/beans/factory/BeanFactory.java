package org.springframework.beans.factory;

/**
 * 简单BeanFactory
 *
 * @author Ling, Jiatong
 * Date: 2022/11/17 10:05
 */
public interface BeanFactory {

    /**
     * 根据beanName获取bean对象实例
     *
     * @param beanName beanName
     * @return bean对象实例
     */
    Object getBean(String beanName);
}
