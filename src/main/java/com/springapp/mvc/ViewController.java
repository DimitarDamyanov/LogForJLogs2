package com.springapp.mvc;

import com.springapp.mvc.logger.AppLogger;
import com.springapp.mvc.logger.ThrowRandomException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller

public class ViewController {
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String indexPage(ModelMap model) {
		return "index";
	}
}

