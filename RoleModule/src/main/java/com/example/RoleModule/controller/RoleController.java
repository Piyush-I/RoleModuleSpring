package com.example.RoleModule.controller;

import com.example.RoleModule.model.RoleDetails;
import com.example.RoleModule.service.RoleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RoleController {
    @Autowired
    private RoleDetailsService roleService;

    @GetMapping("/RoleDetails/{id}")
    public RoleDetails FetchRoleDetails(@PathVariable int id){
        return roleService.getRoleDetails(id);
    }

}
