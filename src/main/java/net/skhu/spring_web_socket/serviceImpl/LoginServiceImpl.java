package net.skhu.spring_web_socket.serviceImpl;

import net.skhu.spring_web_socket.domain.USER;
import net.skhu.spring_web_socket.model.Req.LoginReq;
import net.skhu.spring_web_socket.model.Req.SignUpReq;
import net.skhu.spring_web_socket.repository.UserRepositroy;
import net.skhu.spring_web_socket.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ds on 2018-04-06.
 */

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserRepositroy userRepositroy;

    @Override
    public void signUp(SignUpReq signUpReq) {
        userRepositroy.save(new USER(signUpReq));
    }

    @Override
    public void login(LoginReq loginReq) {

    }
}
