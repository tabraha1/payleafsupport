package com.payleaf.support.models.data;

import com.payleaf.support.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {
}
