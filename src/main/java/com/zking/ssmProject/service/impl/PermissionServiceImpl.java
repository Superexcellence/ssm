package com.zking.ssmProject.service.impl;

import com.zking.ssmProject.mapper.PermissionMapper;
import com.zking.ssmProject.model.Permission;
import com.zking.ssmProject.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> queryModule(Permission permission) {
        return permissionMapper.queryModule(permission);
    }
}
