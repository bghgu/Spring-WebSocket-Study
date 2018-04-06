package net.skhu.spring_web_socket.service;

import net.skhu.spring_web_socket.model.Req.LoginReq;
import net.skhu.spring_web_socket.model.Req.SignUpReq;

/**
 * Created by ds on 2018-04-06.
 */
public interface LoginService {
    void signUp(final SignUpReq signUpReq);
    void login(final LoginReq loginReq);
}
