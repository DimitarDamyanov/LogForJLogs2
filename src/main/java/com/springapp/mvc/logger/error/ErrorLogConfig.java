package com.springapp.mvc.logger.error;

/**
 * Created by D on 14.11.2016 г..
 */
public class ErrorLogConfig extends ErrorLog {

    public static final String NAME = "defaultErrorLogConfig";

    public ErrorLogConfig() {
        super(ErrorLogConfig.class);
    }

    @Override
    public void printLog(String message) {
        logger.error(message);
    }
}
