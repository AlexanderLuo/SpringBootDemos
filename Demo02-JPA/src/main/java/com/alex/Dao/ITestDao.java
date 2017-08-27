package com.alex.Dao;

import com.alex.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITestDao extends JpaRepository<User, Integer> {
    List<User> findByName(String name);
}
