package com.zking.ssmProject.service;

import com.zking.ssmProject.model.Permission;

import java.util.List;

public interface IPermissionService {
    /**
     * 初始化模块
     * @param permission
     * @return
     */
    List<Permission> queryModule(Permission permission);
}