package com.arthurdavila.workshopmongo.services;

import com.arthurdavila.workshopmongo.domain.User;
import com.arthurdavila.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
       return repo.findAll();
    }
}
