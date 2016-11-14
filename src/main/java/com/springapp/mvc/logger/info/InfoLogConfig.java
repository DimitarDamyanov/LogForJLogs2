package com.springapp.mvc.logger.info;

import com.springapp.mvc.logger.*;
import com.springapp.mvc.logger.error.ErrorLog;

/**
 * Created by D on 14.11.2016 г..
 */
public class InfoLogConfig extends InfoLog {

    public static final String NAME = "defaultInfoLogConfig";

    public InfoLogConfig() {
        super(InfoLogConfig.class);
    }

    @Override
    public void printLog(String message) {
        logger.info(message);
    }
}
