package com.nijhazer.jbpm.quickstart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
    @RequestMapping(value="/account/adminHome",method = RequestMethod.GET)
    public String getAdminHomePage(Model model) {
        logger.info("Rendering Home Page");
        model.addAttribute("page_title", "yeah");
        return "home";
	 }

}
