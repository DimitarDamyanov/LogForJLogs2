package com.springapp.mvc.logger;

import com.springapp.mvc.logger.error.ErrorLog;
import com.springapp.mvc.logger.error.ErrorLogConfig;
import com.springapp.mvc.logger.info.InfoLog;
import com.springapp.mvc.logger.info.InfoLogConfig;
import com.springapp.mvc.logger.throwable.ExceptionLogConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by D on 24.12.2015 �..
 */
@Service
public class AppLogger implements IAppLogger {

    @Autowired
    @Qualifier(ErrorLogConfig.NAME)
    private Logger errLog;

    @Autowired
    @Qualifier(InfoLogConfig.NAME)
    private Logger infoLog;

    @Autowired
    @Qualifier(ExceptionLogConfig.NAME)
    private Logger exLog;

    @Override
    public void info(String msg) {
        this.infoLog.printLog(msg);
    }

    @Override
    public void error(String msg) {
        this.errLog.printLog(msg);
    }

    @Override
    public void exception(Throwable throwable) {
        this.exLog.printLog(throwable);
    }
}
