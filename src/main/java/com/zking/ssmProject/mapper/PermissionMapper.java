package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Permission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionMapper {
    /**
     * 初始化模块
     * @param permission
     * @return
     */
    List<Permission> queryModule(Permission permission);
}