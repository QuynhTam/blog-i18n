package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class DashBoardController {
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String showDasBoard() {
        return "dashboard";
    }
}
