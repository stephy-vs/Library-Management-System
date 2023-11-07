package com.assessment.Assessment_1.Controller;

import com.assessment.Assessment_1.Service.UsersService;
import com.assessment.Assessment_1.model.UsersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class UsersController {

    @Autowired
    UsersService usersService;

    @PostMapping("/register")
    public boolean register(@RequestBody UsersModel usersModel){
        UsersModel registeredUser = usersService.registerUser(usersModel.getLogin(),usersModel.getPassword(),usersModel.getEmail());
        return registeredUser==null;
    }

    @PostMapping("/login")
    public String login(@RequestBody UsersModel userModel){
        UsersModel authenticated = usersService.authenticate(userModel.getLogin(),userModel.getPassword());
        if (authenticated != null){
            return "Success";
        }else {
            return "Error Page";
        }
    }
}
