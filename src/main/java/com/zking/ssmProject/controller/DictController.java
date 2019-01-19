package com.zking.ssmProject.controller;

import com.zking.ssmProject.model.Dict;
import com.zking.ssmProject.service.IDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DictController {

    @Autowired
    private IDictService dictServices;


    @RequestMapping("/queryDict")
    @ResponseBody
    public List<Dict> queryDict(Dict dict){
        return dictServices.Sdict(dict);
    }

}
