package com.example.demo_hack.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo_hack.model.User;
import com.example.demo_hack.repo.UserRepository;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User createUser(User user) {
        return repo.save(user);
    }

    public User getUserById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public User updateUser(Long id, User user) {
        User existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(user.getName());
            existing.setEmail(user.getEmail());
            return repo.save(existing);
        }

        return null;
    }

    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}
