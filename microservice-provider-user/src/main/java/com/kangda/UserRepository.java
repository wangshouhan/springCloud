package com.kangda;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by shouhan on 2017/9/13.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}