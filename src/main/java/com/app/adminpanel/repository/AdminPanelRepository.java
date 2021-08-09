package com.app.adminpanel.repository;

import com.app.adminpanel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminPanelRepository extends JpaRepository<User, Integer> {

    public User findByEmailId(String emailId);
    public User findByEmailIdAndPassword(String emailId, String password);
}
