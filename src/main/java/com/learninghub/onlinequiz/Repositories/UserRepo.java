package com.learninghub.onlinequiz.Repositories;


import com.learninghub.onlinequiz.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends CrudRepository<User,Integer> , JpaRepository<User,Integer> {
}
