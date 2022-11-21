package org.springframework.beans.factory;

/**
 * @author Ling, Jiatong
 * Date: 2022/11/21 15:39
 */
public class HelloService {


    public String sayHello() {
        System.out.println("hello");
        return "hello";
    }

}
