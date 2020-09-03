package com.codegym.controller;

import com.codegym.request.Credential;
import com.codegym.response.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLogin(@ModelAttribute("credential") Credential credential) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("credential") Credential credential, Model model) {
        User user = new User();
        user.setUserName(credential.getUserName());
        model.addAttribute("user", user);
        return "redirect:dashboard";
    }
}
