package com.payleaf.support.controllers;

import com.payleaf.support.models.User;
import com.payleaf.support.models.data.IssueDao;
import com.payleaf.support.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("support")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private IssueDao issueDao;

    // Request path: /support
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "User Support");
        model.addAttribute("issues", userDao.findAll());

        return "support/index";
    }

    @RequestMapping(value="/about")
    public String about(Model model) {

        model.addAttribute("title", "About Payleaf");

        return "support/about";
    }

    @RequestMapping(value="/signup")
    public String signup(Model model) {

        model.addAttribute("title", "How to signup");

        return "support/signup";
    }

    @RequestMapping(value="/account")
    public String account(Model model) {

        model.addAttribute("title", "I can't access my account");

        return "support/account";
    }

    @RequestMapping(value="add", method = RequestMethod.GET)
    public String displayAddUserForm(Model model) {

        model.addAttribute("title", "Add a user");
        model.addAttribute(new User());
        return "support/add";
    }

}
