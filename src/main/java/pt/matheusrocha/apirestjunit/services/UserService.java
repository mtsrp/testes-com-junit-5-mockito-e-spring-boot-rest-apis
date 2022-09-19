package pt.matheusrocha.apirestjunit.services;

import pt.matheusrocha.apirestjunit.domain.User;

public interface UserService {
    User findById(Integer id);
}
