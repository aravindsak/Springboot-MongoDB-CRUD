package com.springboot.mongo;
import java.util.List;

import com.springboot.mongo.user.User;
import com.springboot.mongo.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public String save(User user) {
        return repository.save(user).getId();
    }

    public User findById(String id) {
        return repository.findById(id)
                .orElse(null);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

}
