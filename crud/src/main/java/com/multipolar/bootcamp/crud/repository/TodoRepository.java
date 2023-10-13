package com.multipolar.bootcamp.crud.repository;

import com.multipolar.bootcamp.crud.domain.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface TodoRepository extends MongoRepository <Todo,String>{
    Optional<Todo> findByTask(String task);
    @Query("{'task':{$regex:?0,$options:'i'}}")
    Optional<Todo> findByTaskCaseInsensitive(String task);

}
