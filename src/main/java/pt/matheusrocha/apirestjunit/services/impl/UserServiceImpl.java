package pt.matheusrocha.apirestjunit.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.matheusrocha.apirestjunit.domain.User;
import pt.matheusrocha.apirestjunit.repositories.UserRepository;
import pt.matheusrocha.apirestjunit.services.UserService;
import pt.matheusrocha.apirestjunit.services.exceptions.ObjectNotFoundException;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() ->new ObjectNotFoundException("Objeto nao encontrado"));
    }
}
