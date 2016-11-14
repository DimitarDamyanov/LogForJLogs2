package com.springapp.mvc.logger.error;

import com.springapp.mvc.logger.Logger;

/**
 * Created by D on 14.11.2016 г..
 */
public abstract class ErrorLog extends Logger<String> {
    public  ErrorLog(Class<?> src){
        super(src);
    }
}
