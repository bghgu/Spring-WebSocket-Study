package net.skhu.spring_web_socket.model.Message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by ds on 2018-04-06.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResMessage {
    private String id;
    private String name;
    private String contents;
    private Date date;
}
