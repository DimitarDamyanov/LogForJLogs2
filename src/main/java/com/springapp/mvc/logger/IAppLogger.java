package com.springapp.mvc.logger;

/**
 * Created by D on 14.11.2016 г..
 */
public interface IAppLogger {
    void info(String msg);

    void error(String msg);

    void exception(Throwable throwable);
}
