package com.careerhigh.blog.repository;

import com.careerhigh.blog.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
