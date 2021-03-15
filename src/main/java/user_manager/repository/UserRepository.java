package user_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import user_manager.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
