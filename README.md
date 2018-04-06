# Spring WebSocket Study

2018 소프트웨어 캡스톤 디자인 WebSocket Study

1. Spring Official document ex
2. (Spring WebSocket + STOMP + IONIC1을 이용한 채팅)



## 기본개념

**WebSocket**

웹 페이지와 서버간 양방향 통신을 위해 만들어진 프로토콜

하나의 TCP 접속에 Full Duplex 통신 채널을 제공하는 통신 프로토콜,

메시징 아키텍쳐를 의미하지만, 특정 메시징 프로토콜을 요구하진 않는다.

**STOMP**

Streaming/Simple Text Oriented Message Protocol

메시지 기반 미들웨어를 간단히 사용하도록 설계된 텍스트 지향 메시지 프로토콜

프로그래밍 언어 또는 플랫폼에 구애 받지 않는다.

**SockJs**

WebSocket을 지원하지 않는 브라우저를 위한 솔루션

서버에서 WebSocket으로 통신할지 SockJs호환으로 통신할지 결정

클라이언트에선 SockJs를 통해 서버와 통신

## 시작하기

모든 소스코드는 IntelliJ + Window10 + JAVA 8 환경에서 작성되었습니다.

### MAVEN을 이용한 의존성 프로젝트 추가

이 프로젝트에서는 아래 같은 **의존성 프로젝트**가 포함되어있습니다. 

**pom.xml** 파일에 아래와 같이 **의존성 프로젝트**를 추가해 주세요.

```
	<dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-websocket</artifactId>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-tomcat</artifactId>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>sockjs-client</artifactId>
            <version>1.0.2</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>stomp-websocket</artifactId>
            <version>2.3.3</version>
        </dependency>

        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>3.3.7</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>jquery</artifactId>
            <version>3.1.0</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>webjars-locator-core</artifactId>
        </dependency>
    </dependencies>
```
## 실행하기

window 10 환경

- `jdk8` 과 `maven` 을 설치합니다.
- `JAVA_JOME` 환경변수 설정을 합니다.
- `Path`에 `maven` 환경변수 설정을 합니다.spring boot 앱 실행

```
mvn spring-boot:run
```

- 중지하려면, 키보드에서 `Crtl + C`를 누릅니다.
- `application.properties` 파일이 필요합니다.

AWS EC2 Ubuntu 환경

- `jdk8` 과 `maven` 을 설치합니다.

백 그라운드 spring boot 앱 실행

```
nohup mvn spring-boot:run&
```

- 중지하려면,  `netstat -tnlp` 명령어를 통해 프로세스를 kill 하십시오.
- `application.properties` 파일이 필요합니다.

## 사용된 도구

* [Spring-boot](https://projects.spring.io/spring-boot/) - Spring-boot Web Framework
* [Maven](https://maven.apache.org/) - 의존성 관리 프로그램
* [IntelliJ IDEA](https://www.jetbrains.com/idea/) - IDEA
* [SockJS](https://github.com/sockjs) - WebSocket 미지원 브라우저를 위한 솔루션
* [bootstrapk](http://bootstrapk.com/) - CSS 도우미
* [jQuery](https://jquery.com/) - DOM 객체 접근 도우미
* [IONIC1](https://ionicframework.com/docs/v1/) - Hybrid App Framework

## 저자

* **배다슬** - [bghgu](https://github.com/bghgu)


[기여자 목록](https://github.com/bghgu/Spring-WebSocket-Study/contributors)을 확인하여 이 프로젝트에 참가하신 분들을 보실 수 있습니다.

## 감사 인사

* Spring Official Document ex https://spring.io/guides/gs/messaging-stomp-websocket
* http://asfirstalways.tistory.com/359

---


