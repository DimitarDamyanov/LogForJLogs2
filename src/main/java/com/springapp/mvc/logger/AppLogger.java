package com.springapp.mvc.logger;

/**
 * Created by D on 24.12.2015 ã..
 */
public class AppLogger {

    private static InfoLog infoLog = null;
    private static ErrorLog errorLog = null;
    private static ExceptionLog exceptionLog = null;

    public static void info(Object message){
        if(infoLog == null){
            infoLog = new InfoLog();
        }
        infoLog.printLog(message);
    }

    public static void error(Object message){
        if(errorLog == null){
            errorLog = new ErrorLog();
        }
        errorLog.printLog(message);
    }

    public static void exception(Object message){
        if(exceptionLog == null){
            exceptionLog = new ExceptionLog();
        }
        exceptionLog.printLog(message);
    }


}
