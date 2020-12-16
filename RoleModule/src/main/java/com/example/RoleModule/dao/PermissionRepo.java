package com.example.RoleModule.dao;

import com.example.RoleModule.model.Permission;
import org.springframework.data.repository.CrudRepository;

public interface PermissionRepo extends CrudRepository<Permission, Integer> {
}
