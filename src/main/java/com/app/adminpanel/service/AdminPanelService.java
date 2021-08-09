package com.app.adminpanel.service;

import com.app.adminpanel.model.User;
import com.app.adminpanel.repository.AdminPanelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminPanelService {
    @Autowired
    private AdminPanelRepository repo;

    public User saveUser(User user){
      return  repo.save(user);
    }
    public User fetchUserByEmailId(String email) {
        return repo.findByEmailId(email);
    }

    public User fetchUserByEmailIdAndPassword(String email, String password ) {
        return repo.findByEmailIdAndPassword(email, password);
    }


}
