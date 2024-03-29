package com.billing.invoice.repositories;

import com.billing.invoice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /*
        User findByUserId(Long userId);
    */
    User findByUserName(String userName);

}
