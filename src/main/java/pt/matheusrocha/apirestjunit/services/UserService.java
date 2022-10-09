package pt.matheusrocha.apirestjunit.services;

import pt.matheusrocha.apirestjunit.domain.User;
import pt.matheusrocha.apirestjunit.domain.dto.UserDTO;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
}
