package org.launchcode.mygame.models.data;

import org.launchcode.mygame.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}
