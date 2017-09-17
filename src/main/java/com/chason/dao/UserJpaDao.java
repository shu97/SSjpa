package com.chason.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chason.bean.User;
import org.springframework.stereotype.Repository;

/**
 * The Interface UserJpaDao.
 * @author abel
 */
@Repository
public interface UserJpaDao extends JpaRepository<User, Long> {

    /**
     * Find by name.
     *
     * @param name the name
     * @return the user
     */
    User findByName(String name);


}