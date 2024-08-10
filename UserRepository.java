package com.CRUDz;

import org.springframework.data.jpa.repository.JpaRepository;
import com.CRUDz.User; 

public interface UserRepository extends JpaRepository<User, Long> {

}
