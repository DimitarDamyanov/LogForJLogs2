package com.springapp.mvc.logger;

/**
 * Created by D on 24.12.2015 ã..
 */
public class ErrorLog  extends Logger {

    ErrorLog(){
        super(ErrorLog.class);
    }

    @Override
    public void printLog(Object message) {
        logger.error(message);
    }
}