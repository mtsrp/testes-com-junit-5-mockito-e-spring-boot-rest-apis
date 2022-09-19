package pt.matheusrocha.apirestjunit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.matheusrocha.apirestjunit.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
