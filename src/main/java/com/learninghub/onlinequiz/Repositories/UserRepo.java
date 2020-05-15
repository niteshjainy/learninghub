package com.learninghub.onlinequiz.Repositories;


import com.learninghub.onlinequiz.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User,Integer> {

}
