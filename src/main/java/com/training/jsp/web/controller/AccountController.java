package com.training.jsp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/login")
    public String login(HttpServletResponse response, HttpSession session) {
        return "account/login";
    }
}
