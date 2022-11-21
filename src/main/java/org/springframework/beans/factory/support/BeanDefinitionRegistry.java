package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册表接口
 *
 * @author Ling, Jiatong
 * Date: 2022/11/21 11:49
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册BeanDefinition
     *
     * @param beanName bean的名称
     * @param beanDefinition BeanDefinition实例
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
