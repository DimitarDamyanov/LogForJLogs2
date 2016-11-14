package com.springapp.mvc.logger.info;

import com.springapp.mvc.logger.Logger;

/**
 * Created by D on 14.11.2016 г..
 */
public abstract class InfoLog extends Logger<String> {
    public InfoLog(Class<?> src){
        super(src);
    }
}
