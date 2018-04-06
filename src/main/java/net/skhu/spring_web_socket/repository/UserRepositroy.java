package net.skhu.spring_web_socket.repository;

import net.skhu.spring_web_socket.domain.USER;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ds on 2018-04-06.
 */
public interface UserRepositroy extends CrudRepository<USER, String> {
}
