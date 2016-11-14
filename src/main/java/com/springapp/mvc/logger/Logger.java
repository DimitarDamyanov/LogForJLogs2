package com.springapp.mvc.logger;

import org.apache.logging.log4j.LogManager;
import sun.rmi.runtime.Log;

/**
 * Created by D on 24.12.2015 �..
 */
public abstract class Logger<T> {

    protected org.apache.logging.log4j.Logger logger;

    public Logger(Class<?> src) {
        this.logger = LogManager.getLogger(src);
    }

    public abstract void printLog(T message);
}
