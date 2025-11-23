package me.raivydassimenas.store_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import me.raivydassimenas.store_backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername(String username);
}
