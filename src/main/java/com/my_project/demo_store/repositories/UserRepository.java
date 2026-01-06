package com.my_project.demo_store.repositories;

import com.my_project.demo_store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
