package in.ac.jmi.repositories;

import in.ac.jmi.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
