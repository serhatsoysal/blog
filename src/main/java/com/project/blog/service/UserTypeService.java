package com.project.blog.service;

import com.project.blog.model.UserType;
import com.project.blog.repository.UserTypeRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class UserTypeService {

    private final UserTypeRepository userTypeRepository;

    public UserType getObjectById(Integer id) {
        return userTypeRepository.findById(id).orElseThrow();
    }
}
