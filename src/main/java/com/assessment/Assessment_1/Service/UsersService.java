package com.assessment.Assessment_1.Service;

import com.assessment.Assessment_1.Dao.UsersRepository;
import com.assessment.Assessment_1.model.UsersModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersModel registerUser(String login,String password,String email){
        if (login == null && password == null) {
            return null;
        } else {
            if (usersRepository.findFirstByLogin(login).isPresent()){
                System.out.println("Duplicate Login");
                return null;
            }
            UsersModel userModel = new UsersModel();
            userModel.setLogin(login);
            userModel.setPassword(password);
            userModel.setEmail(email);
            return usersRepository.save(userModel);

        }

    }

    public UsersModel authenticate(String login, String password){
        return usersRepository.findByLoginAndPassword(login, password).orElse(null);
    }
}
