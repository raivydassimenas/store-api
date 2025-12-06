package me.raivydassimenas.store_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import me.raivydassimenas.store_api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername(String username);
}
