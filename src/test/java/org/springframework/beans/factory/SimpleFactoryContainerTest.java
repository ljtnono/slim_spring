package org.springframework.beans.factory;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * 简单BeanFactory容器测试类
 *
 * @author Ling, Jiatong
 * Date: 2022/11/21 09:57
 */
public class SimpleFactoryContainerTest {

    @Test
    public void testGetBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloService", new HelloService());
        // 获取Bean对象
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        assertThat(helloService).isNotNull();
        assertThat(helloService.sayHello()).isEqualTo("hello");
    }

    class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}
