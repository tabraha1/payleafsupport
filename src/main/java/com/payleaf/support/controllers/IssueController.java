package com.payleaf.support.controllers;

import com.payleaf.support.models.Issue;
import com.payleaf.support.models.data.IssueDao;
import com.payleaf.support.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="issue")
public class IssueController {

    @Autowired
    private IssueDao issue;

    @Autowired
    private UserDao userDao;

    @RequestMapping(value="")
    public String issue(Model model) {

        model.addAttribute("title", "Tell us what the issue is");

        return "issue/issue";
    }
}
