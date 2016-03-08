package com.springapp.mvc.logger;

/**
 * Created by D on 24.12.2015 ã..
 */
public class InfoLog extends Logger {

    InfoLog(){
        super(InfoLog.class);
    }

    @Override
    public void printLog(Object message) {
        logger.info(message);
    }
}
