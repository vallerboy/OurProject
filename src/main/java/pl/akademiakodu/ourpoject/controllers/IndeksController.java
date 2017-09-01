package pl.akademiakodu.ourpoject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndeksController {
    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public String indexGet(){
        return "index";
    }
    @RequestMapping(path = "/index", method = RequestMethod.POST)
    public String indexPost(@RequestParam("name")String name,
                            @RequestParam("surname")String lastname,
                            @RequestParam("email")String email,
                            @RequestParam("login")String login,
                            @RequestParam("password")String password,
                            @RequestParam("repeatPassword")String repeatPassword, Model model) {
    return "index";
    }
}
