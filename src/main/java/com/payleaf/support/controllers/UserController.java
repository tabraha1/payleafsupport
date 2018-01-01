package com.payleaf.support.controllers;

import com.payleaf.support.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("support")
public class UserController {

    @Autowired
    private UserDao userDao;

    // Request path: /support
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "User Support");
        model.addAttribute("issues", userDao.findAll());

        return "user/index";
    }

    @RequestMapping(value="/about")
    public String about(Model model) {

        model.addAttribute("title", "About Payleaf");

        return "about/index";
    }

}
