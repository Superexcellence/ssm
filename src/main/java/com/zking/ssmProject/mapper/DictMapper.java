package com.zking.ssmProject.mapper;

import com.zking.ssmProject.model.Dict;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DictMapper {

    /**
     * 字典表查询
     * @param dict
     * @return
     */
    List<Dict> Sdict(Dict dict);

}