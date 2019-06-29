package com.gfg.siddhant.SpringBootBackendService.service;

import com.gfg.siddhant.SpringBootBackendService.model.User;
import com.gfg.siddhant.SpringBootBackendService.repository.UserRepository;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDaoService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User findUserById(Long id){
        Optional<User> user = userRepository.findById(id);

        if(!user.isPresent())
            throw new IllegalIdentifierException("id" + id);
        return user.get();
    }

    public void createUser(User user){
        userRepository.save(user);
        return;
    }

    public void updateUser(User user){
        userRepository.save(user);
        return;
    }

    public void deleteUser(Long id){
        User user = findUserById(id);
        userRepository.delete(user);
        return;
    }

}
