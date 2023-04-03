package com.project.blog.repository;

import com.project.blog.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
