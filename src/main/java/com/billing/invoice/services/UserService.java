package com.billing.invoice.services;

import com.billing.invoice.entity.User;
import com.billing.invoice.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<User> addUser(User user) {
        user.setId(user.getId());
        user.setName(user.getName());
        user.setLastName(user.getLastName());
        userRepository.save(user);
        return ResponseEntity.ok(user);
    }

    public ResponseEntity<User> updateUser(User user) {
        user.setName(user.getName());
        user.setLastName(user.getLastName());
        return ResponseEntity.ok(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public String deleteUser(Long userId) {
        userRepository.deleteById(userId);
        return "Silindi" + userId;
    }

    public Optional<User> findUser(Long userId) {
        return userRepository.findById(userId);
    }
    public User findUserByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }


}
