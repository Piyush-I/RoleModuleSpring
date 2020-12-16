package com.example.RoleModule.service;

import com.example.RoleModule.dao.PermissionRepo;
import com.example.RoleModule.dao.RoleMapRepo;
import com.example.RoleModule.dao.RoleRepo;
import com.example.RoleModule.model.Permission;
import com.example.RoleModule.model.Role;
import com.example.RoleModule.model.RoleDetails;
import com.example.RoleModule.model.RolePermission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleDetailsService implements RoleDetailsMethods {
    @Autowired
    PermissionRepo permRepo;
    @Autowired
    RoleMapRepo mapRepo;
    @Autowired
    RoleRepo roleRepo;

    @Override
    public RoleDetails getRoleDetails(int id) {
        int roleId = id;
        Optional<RolePermission> rollMap = this.mapRepo.findById(roleId);
        int permId = rollMap.get().getPermId();
        Optional<Permission> perm = this.permRepo.findById(permId);
        String permName = perm.get().getPermName();
        Optional<Role> role = this.roleRepo.findById(roleId);
        String rolename = role.get().getRollName();

        RoleDetails details = new RoleDetails(roleId,permId,rolename,permName);

        return details;

    }
}
