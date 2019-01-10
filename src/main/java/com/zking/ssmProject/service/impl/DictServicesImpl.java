package com.zking.ssmProject.service.impl;

import com.zking.ssmProject.mapper.DictMapper;
import com.zking.ssmProject.model.Dict;
import com.zking.ssmProject.service.IDictServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictServicesImpl implements IDictServices {

    @Autowired
    private DictMapper dictMapper;

    @Override
    public List<Dict> Sdict(Dict dict) {
        return dictMapper.Sdict(dict);
    }
}
