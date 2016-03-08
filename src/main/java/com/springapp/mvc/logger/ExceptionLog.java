package com.springapp.mvc.logger;

/**
 * Created by D on 24.12.2015 ã..
 */
public class ExceptionLog  extends Logger {

    ExceptionLog(){
        super(ExceptionLog.class);
    }

    @Override
    public void printLog(Object message) {
        logger.catching((Throwable) message);
    }
}

