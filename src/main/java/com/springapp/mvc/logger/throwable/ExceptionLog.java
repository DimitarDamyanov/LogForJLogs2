package com.springapp.mvc.logger.throwable;

import com.springapp.mvc.logger.Logger;

/**
 * Created by D on 14.11.2016 г..
 */
public abstract class ExceptionLog extends Logger<Throwable> {
    public ExceptionLog(Class<?> src) {
        super(src);
    }
}
