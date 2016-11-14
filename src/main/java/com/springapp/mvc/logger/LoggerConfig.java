package com.springapp.mvc.logger;

import com.springapp.mvc.logger.error.ErrorLogConfig;
import com.springapp.mvc.logger.info.InfoLogConfig;
import com.springapp.mvc.logger.throwable.ExceptionLogConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by D on 14.11.2016 г..
 */
@Configuration
public class LoggerConfig {

    @Bean(name = ErrorLogConfig.NAME)
    public ErrorLogConfig defaultErrorLogConfiguration(){
        return new ErrorLogConfig();
    }

    @Bean(name = InfoLogConfig.NAME)
    public InfoLogConfig defaultInfoLogConfiguration(){
        return  new InfoLogConfig();
    }

    @Bean(name = ExceptionLogConfig.NAME)
    public ExceptionLogConfig defaultExceptionLogConfiguration(){
        return new ExceptionLogConfig();
    }


}
