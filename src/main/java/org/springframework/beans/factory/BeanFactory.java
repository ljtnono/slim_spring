package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 简单BeanFactory
 *
 * @author Ling, Jiatong
 * Date: 2022/11/17 10:05
 */
public class BeanFactory {

    private Map<String, Object> beanMap = new HashMap<>();


    public void registerBean(String name, Object object) {
        beanMap.put(name, object);
    }

    public Object getBean(String beanName) {
        return beanMap.get(beanName);
    }

}
