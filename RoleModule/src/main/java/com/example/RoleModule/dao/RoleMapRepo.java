package com.example.RoleModule.dao;

import com.example.RoleModule.model.RolePermission;
import org.springframework.data.repository.CrudRepository;

public interface RoleMapRepo extends CrudRepository<RolePermission, Integer> {
}
