package net.skhu.spring_web_socket.controller;

import net.skhu.spring_web_socket.model.Req.LoginReq;
import net.skhu.spring_web_socket.model.Req.SignUpReq;
import net.skhu.spring_web_socket.model.Res.DefaultRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ds on 2018-04-06.
 */

@RestController
public class loginController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping("sign-up")
    public ResponseEntity<DefaultRes> signUp(@RequestBody SignUpReq signUpReq) {
        logger.info(signUpReq.toString());
        ResponseEntity<DefaultRes> resResponseEntity = null;
        return resResponseEntity;
    }

    @PostMapping("login")
    public ResponseEntity<DefaultRes> login(@RequestBody LoginReq loginReq) {
        logger.info(loginReq.toString());
        ResponseEntity<DefaultRes> resResponseEntity = null;
        return resResponseEntity;
    }
}
