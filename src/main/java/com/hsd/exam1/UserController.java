package com.hsd.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class UserController {
    @RequestMapping("")
    @ResponseBody
    public String users(){
        return "유저 여러명!!! ^^";
    }

    @RequestMapping("1")
    @ResponseBody
    public User user(){
        User user = new User();
        return user;
    }
}
