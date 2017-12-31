package com.payleaf.support.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("support")
public class UserController {

    // Request path: /support
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "User Support");

        return "user/index";
    }

    @RequestMapping(value="/about")
    public String about(Model model) {

        model.addAttribute("title", "About Payleaf");

        return "about/index";
    }

}
