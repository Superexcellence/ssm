package com.zking.ssmProject.service;

import com.zking.ssmProject.model.Dict;

import java.util.List;

public interface IDictServices {

    /**
     * 字典表查询
     * @param dict
     * @return
     */
    List<Dict> Sdict(Dict dict);

}