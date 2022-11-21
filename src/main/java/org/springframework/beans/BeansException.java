package org.springframework.beans;

/**
 * Bean异常
 *
 * @author Ling, Jiatong
 * Date: 2022/11/21 14:18
 */
public class BeansException extends RuntimeException{

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
