package com.springapp.mvc;

import com.springapp.mvc.logger.AppLogger;
import com.springapp.mvc.logger.ThrowRandomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by D on 25.12.2015 ã..
 */

@Controller
public class LogController {

    @RequestMapping(method = RequestMethod.POST, value = "/log/information")
    public String logInformation(HttpServletRequest request){
        System.out.println(request.getParameter("information"));
        AppLogger.info(request.getParameter("information"));
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/log/error")
    public String logError(HttpServletRequest request){
        System.out.println(request.getParameter("error"));
        AppLogger.info(request.getParameter("error"));
        return "hello";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/log/exception")
    public String logException(HttpServletRequest request){
        ThrowRandomException throwRandomException = new ThrowRandomException();
        try{
            throwRandomException.throwException();
        } catch (Exception e){
            AppLogger.exception(e);
        }

        return "hello";
    }
}
