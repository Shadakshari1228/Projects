package com.frank.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(
            Model model,
            @RequestParam(name = "message", required = false) String message) {
        System.out.println("Index controller called");
        model.addAttribute("message", message);
        return "index";
    }

}
