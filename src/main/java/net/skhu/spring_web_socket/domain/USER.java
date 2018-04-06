package net.skhu.spring_web_socket.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.skhu.spring_web_socket.model.Req.SignUpReq;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ds on 2018-04-06.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class USER {

    @Id
    private String id;
    private String pw;
    private String name;

    public USER(final SignUpReq signUpReq) {
        this.id = signUpReq.getId();
        this.pw = signUpReq.getPw();
        this.name = signUpReq.getName();
    }
}
