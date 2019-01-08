package com.zking.ssmProject.controller;

import com.zking.ssmProject.model.Permission;
import com.zking.ssmProject.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PermissionController {

    @Autowired
    private IPermissionService permissionService;

    /**
     * 初始化模块
     * @param permission
     * @return
     */
    @RequestMapping("/queryModule")
    @ResponseBody
    public Map<String,Object> queryModule(Permission permission){
        List<Permission> permissions = permissionService.queryModule(permission);
        List<Map<String, Object>> list=new ArrayList<>();
        Map<String, Object> maps =new HashMap<>();
        Map<String, Object> map = null;
        for (Permission p : permissions) {
            map= new HashMap<>();
            map.put("id", p.getPid());
            map.put("title", p.getPername()) ;
            map.put("icon","icon-text");
            map.put("spread",false);
            if(null!=p.getPerurl()||""!=p.getPerurl()){
                map.put("href",p.getPerurl());
            }
            permission.setPid(p.getPerid());
            map.put("children", queryModule1(permission));
            list.add(map);
        }
        maps.put("contentManagement",list);
        return maps;
    }
    public List<Map<String,Object>> queryModule1(Permission permission){
        List<Permission> permissions = permissionService.queryModule(permission);
        List<Map<String, Object>> list=new ArrayList<>();
        Map<String, Object> map = null;
        for (Permission p : permissions) {
            map= new HashMap<>();
            map.put("id", p.getPerid());
            map.put("title", p.getPername()) ;
            map.put("icon","icon-text");
            map.put("spread",false);
            map.put("href",p.getPerurl());
            list.add(map);
        }
        return list;
    }
}
