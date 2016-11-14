package com.springapp.mvc.logger.throwable;

/**
 * Created by D on 14.11.2016 г..
 */
public class ExceptionLogConfig extends ExceptionLog {

    public static final String NAME = "defaultExceptionLogConfig";

    public ExceptionLogConfig() {
        super(ExceptionLogConfig.class);
    }

    @Override
    public void printLog(Throwable message) {
        logger.catching(message);
    }
}
