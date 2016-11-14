package com.springapp.mvc;

import com.springapp.mvc.logger.AppLogger;
import com.springapp.mvc.logger.ThrowRandomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by D on 25.12.2015 �..
 */

@Controller
public class LogController {

    @Autowired
    private AppLogger logger;

    @Autowired
    private ThrowRandomException tre;

    @RequestMapping(method = RequestMethod.POST, value = "/log/information")
    public String logInformation(HttpServletRequest request){
       logger.info(request.getParameter("information"));
       return "index";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/log/error")
    public String logError(HttpServletRequest request){
        logger.error(request.getParameter("error"));
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/log/exception")
    public String logException(HttpServletRequest request){
        try{
            tre.throwException();
        } catch (Exception e){
            logger.exception(e);
        }
        return "index";
    }
}
