package user_manager.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user_manager.model.User;
import user_manager.repository.UserRepository;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public boolean remove(Long id) {
        userRepository.delete(id);
        return true;
    }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(Long id, User user) {
        return userRepository.save(user);
    }
}
