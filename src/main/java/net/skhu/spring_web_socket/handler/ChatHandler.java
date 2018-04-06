package net.skhu.spring_web_socket.handler;

import net.skhu.spring_web_socket.model.Greeting;
import net.skhu.spring_web_socket.model.HelloMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ds on 2018-04-06.
 */

@RestController
public class ChatHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greetig(HelloMessage messages) throws Exception {
        logger.info(messages.getName());
        Thread.sleep(1000);
        return new Greeting("Hello, " + messages.getName() + "!");
    }
}
