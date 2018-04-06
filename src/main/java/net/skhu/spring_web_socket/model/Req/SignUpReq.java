package net.skhu.spring_web_socket.model.Req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ds on 2018-04-06.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpReq {
    private String id;
    private String pw;
    private String name;
}
