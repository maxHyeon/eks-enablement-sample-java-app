package com.aws.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CallerController {
    @Autowired
    CallerService callerService;

    @GetMapping("/caller")
    public ModelAndView getCallerIdentity() {
        ModelAndView modelAndView = new ModelAndView("caller");
        modelAndView.addObject("caller", callerService.getCaller());
        return modelAndView;
    }
}
