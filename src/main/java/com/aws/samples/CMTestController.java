package com.aws.samples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CMTestController {
    @Value("${configmap-test.value}")
    private String cmValue;

    @GetMapping("/configmap-value")
    public ModelAndView hello() {
        ModelAndView modelAndView = new ModelAndView("configmap-value");
        modelAndView.addObject("ConfigMapValue", cmValue);
        return modelAndView;
    }
}
