package com.jpacrud.dao;

import com.jpacrud.entities.User;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    public List<User> findByName(String name);
}
