package com.aws.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ClusterInfoController {
    @Autowired
    ClusterInfoService clusterInfoService;

    @GetMapping("/cluster")
    public ModelAndView listCluster() {
        ModelAndView modelAndView = new ModelAndView("cluster");
        modelAndView.addObject("clusters", clusterInfoService.listClusters());
        return modelAndView;
    }
}
