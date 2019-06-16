package com.shopping.controller;

import com.shopping.model.User;
import com.shopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * @author : Vishal Srivastava
 * @Date : 11-06-2019
 **/

@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/add")
    public ResponseEntity<?> save(@RequestBody User user) {
        User userobj = new User();
        userobj.setUsername(user.getUsername());
        userobj.setPassword(passwordEncoder.encode(user.getPassword()));
        userobj.setAge(user.getAge());
        userobj.setCountry(user.getCountry());
        userRepository.save(userobj);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @GetMapping(value = "/getall")
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/getbyid/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.getOne(id);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok("User Delete Successfully");
    }


}
