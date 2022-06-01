package com.example.testSpringProject.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.example.testSpringProject.Model.User;
import com.example.testSpringProject.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/POSTusers")
    public User createNewUser(@RequestBody User newUser) {
        System.out.println("reaches here!!!!!");
        return userRepository.save(newUser);
    }

    //test
    @GetMapping("/test")
    public String bruh() {
        List<User> newUserList = new ArrayList<User>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.setId(0001L);
        user2.setId(0002L);
        user3.setId(0003L);

        user1.setName("hoang1");
        user2.setName("hoang2");
        user3.setName("hoang3");

        user1.setEmail("h1@gmail.com");
        user2.setEmail("h2@gmail.com");
        user3.setEmail("h3@gmail.com");

        newUserList.add(user1);
        newUserList.add(user2);
        newUserList.add(user3);

        //System.out.println("bruh moment!");
        return "newUserList";
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        // test
        List<User> userList = new ArrayList<User>();
        User bruh1 = new User();
        bruh1.setId(0011345L);
        bruh1.setEmail("hmail.com");
        bruh1.setName("Hoang");

        User bruh2 = new User();
        bruh2.setId(0023647L);
        bruh2.setEmail("aaa@gmail.com");

        userList.add(bruh1);
        userList.add(bruh2);

        return userList;
        //end test
        //return userRepository.findAll();

    }

    @GetMapping("/users/{userName}")
    public Optional<User> getUserByUsername(@PathVariable("userName") String userName) {
        Optional<User> userOptional = userRepository.findByName(userName);
        if(userOptional.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This user does not exist");
        }
        return userRepository.findByName(userName);
    }


    @PutMapping("/users/{userName}")
    public User updateUser(@PathVariable("userName") String userName, @RequestBody User userChanges) {
        User user = userRepository.findByName(userName)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "This use does not exist"));

        user.setName(userChanges.getName());
        user.setEmail(userChanges.getEmail());

        return userRepository.save(user);
    }

}
