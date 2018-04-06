package net.skhu.spring_web_socket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by ds on 2018-04-06.
 */

/**
 * HelloMessage Broker 설정
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    /**
     * 메세지 중개인에 의해 웹 소켓 메세지를 처리할 수 있게 설정
     * @param config
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        //메모리 기반 메시지 브로커가 해당 api를 구독하고 있는 클라이언트에게 메세지 전달
        config.enableSimpleBroker("/topic");
        //서버에서 클라이언트로부터의 메세지를 받을 api의 prefix
        config.setApplicationDestinationPrefixes("/app");
    }

    /**
     * 클라이언트에서 webSocket을 연결할 api를 설정
     * sockJs에서 접속을 시도할 수 있게 설정
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //여러가지 엔드 포인트 설정
        registry.addEndpoint("/test").withSockJS();
    }

}
