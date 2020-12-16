package com.example.RoleModule.dao;

import com.example.RoleModule.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepo extends CrudRepository<Role, Integer> {
}
